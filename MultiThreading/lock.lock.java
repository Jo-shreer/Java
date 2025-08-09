/*
Explanation:
We use a ReentrantLock to guard the increment() method.
Each thread increments the shared counter 5 times.
lock.lock() acquires the lock; lock.unlock() releases it in a finally block to ensure unlocking.
Thread.sleep(100) simulates some work and makes thread switching visible.
main starts the threads and waits for them to finish (join).
Final count should be 10 (5 increments per thread).
*/
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithLock 
{
    private int count = 0;
    private final Lock lock = new ReentrantLock();
  
    public void increment() 
    {
        lock.lock();
        try 
        {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
        } 
        finally 
        {
            lock.unlock();
        }
    }

    public int getCount() 
    {
        return count;
    }

    // Main method to demonstrate multi-threaded increments
    public static void main(String[] args) throws InterruptedException 
    {
        CounterWithLock counter = new CounterWithLock();

        Thread t1 = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) 
            {
                counter.increment();
                try 
                {
                    Thread.sleep(100); // simulate some work
                } 
                catch (InterruptedException e) 
                {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> 
        {
            for (int i = 0; i < 5; i++) 
            {
                counter.increment();
                try 
                {
                    Thread.sleep(100);
                } 
                catch (InterruptedException e) 
                {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
