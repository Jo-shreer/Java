/*
✅ Synchronization in Java (Single-click Copy Format)

🔹 What is Synchronization?
- A mechanism to control access to shared resources by multiple threads.
- Ensures that only one thread at a time can execute a synchronized block or method.
- Prevents race conditions and data inconsistency.

🔹 Why Use Synchronization?
- To avoid problems like lost updates, inconsistent reads, and corrupted data.
- Critical when threads modify shared mutable data.

🔹 How to Synchronize:
1. Synchronized Method:
   - Use `synchronized` keyword in method declaration.
2. Synchronized Block:
   - Use `synchronized(object)` block to lock a specific object.

🔹 Example: Synchronized Method

*/

class Counter 
{
    private int count = 0;

    // synchronized method ensures atomic increment
    public synchronized void increment() 
    {
        count++;
    }

    public int getCount() 
    {
        return count;
    }
}

public class SynchronizationExample 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Counter counter = new Counter();

        Runnable task = () -> 
        {
            for (int i = 0; i < 1000; i++) 
            {
                counter.increment();  // synchronized increment
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}

/*
🔹 Expected Output:
Final count: 2000

🔹 Without synchronization, count may be less than 2000 due to race conditions.

🔹 Notes:
- Synchronization can cause thread contention, so use it only when necessary.
- For better performance in some cases, consider using atomic classes
  (like AtomicInteger).
*/
