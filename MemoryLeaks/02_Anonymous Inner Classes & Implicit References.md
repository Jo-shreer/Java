# When you create an anonymous inner class or a non-static inner class inside another class, 
# the inner class implicitly holds a reference to its outer class instance.

import java.util.ArrayList;
import java.util.List;

interface EventListener 
{
    void onEvent(String message);
}

public class EventSource 
{
    private List<EventListener> listeners = new ArrayList<>();

    public void registerListener(EventListener listener) 
    {
        listeners.add(listener);
    }

    public void fireEvent() 
    {
        for (EventListener listener : listeners) {
            listener.onEvent("Event fired!");
        }
    }
}

public class LeakyComponent 
{
    private EventSource eventSource;

    public LeakyComponent(EventSource source) 
    {
        this.eventSource = source;

        // Anonymous inner class listener holds implicit reference to LeakyComponent
        eventSource.registerListener(new EventListener() 
        {
            @Override
            public void onEvent(String message) 
            {
                System.out.println("Received: " + message);
                doSomething();
            }
        });
    }

    private void doSomething() 
    {
        System.out.println("LeakyComponent doing work...");
    }
}

> Here, the anonymous inner class EventListener implicitly keeps a reference to its 
enclosing LeakyComponent instance.
> EventSource stores this listener in its listeners list, a strong reference.
> As a result, LeakyComponent cannot be garbage collected as long as EventSource holds the listener reference.
This causes a memory leak if you create many LeakyComponent instances but never remove their listeners.

# The Fix: Unregister the Listener to Allow GC
To avoid the leak, you need to:
Keep a reference to the listener object so you can unregister it later.
Provide a method in EventSource to remove listeners.
Call this unregister method when LeakyComponent is no longer needed.

# Step 1: Modify EventSource to support unregistering
public class EventSource 
{
    private List<EventListener> listeners = new ArrayList<>();

    public void registerListener(EventListener listener) 
    {
        listeners.add(listener);
    }
    
    public void unregisterListener(EventListener listener) 
    {
        listeners.remove(listener);
    }

    public void fireEvent() 
    {
        for (EventListener listener : listeners) {
            listener.onEvent("Event fired!");
        }
    }
}

# Step 2: Update LeakyComponent to keep listener reference and unregister
public class LeakyComponent 
{
    private EventSource eventSource;
    private EventListener listener;

    public LeakyComponent(EventSource source) 
    {
        this.eventSource = source;

        // Keep reference to listener
        listener = new EventListener() 
        {
            @Override
            public void onEvent(String message) 
            {
                System.out.println("Received: " + message);
                doSomething();
            }
        };

        eventSource.registerListener(listener);
    }

    // Call this when done with the component to avoid leak
    public void cleanup() 
    {
        eventSource.unregisterListener(listener);
    }

    private void doSomething() 
    {
        System.out.println("LeakyComponent doing work...");
    }
}

# main
public class Main 
{
    public static void main(String[] args) throws InterruptedException 
    {
        EventSource source = new EventSource();
        LeakyComponent comp = new LeakyComponent(source);
        source.fireEvent();
        comp.cleanup();
        comp = null;
        System.gc();
        source.fireEvent();
        System.out.println("Program finished.");
    }
}

# Why does this fix the leak?
> When you call cleanup(), the listener is removed from EventSource's list.
The strong reference from EventSource to the listener is gone.
> Since no other references point to the listener or the enclosing LeakyComponent, 
both become eligible for garbage collection.
> Memory is freed, preventing leaks.

