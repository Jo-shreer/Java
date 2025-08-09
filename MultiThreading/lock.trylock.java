/*
how to use tryLock() with ReentrantLock in Java. Unlike lock(), tryLock() attempts to acquire the lock
immediately and returns true if successful, or false if the lock is already held by another thread, so your thread won’t block waiting.

What happens here?
Both threads try to get the lock without waiting.
If the lock is free, tryLock() returns true and the thread works inside the critical section.
If not, tryLock() returns false immediately, and the thread can do alternative work or retry later.
This avoids thread blocking, useful when you want to attempt a task only if the lock is free.
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample 
{
    private final Lock lock = new ReentrantLock();

    public void doWork() 
    {
        if (lock.tryLock()) or (lock.tryLock(300, TimeUnit.MILLISECONDS))  // try to acquire the lock without waiting, we can mentione time also
        {  
            try 
            {
                System.out.println(Thread.currentThread().getName() + " acquired the lock and is working");
                // Simulate work
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            } 
            finally 
            {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released the lock");
            }
        } 
        else 
        {
            System.out.println(Thread.currentThread().getName() + " could NOT acquire the lock and will do something else");
        }
    }

    public static void main(String[] args) 
    {
        TryLockExample example = new TryLockExample();

        Runnable task = () -> 
        {
            for (int i = 0; i < 3; i++) 
            {
                example.doWork();
                try 
                {
                    Thread.sleep(200); // Wait before retrying
                } 
                catch (InterruptedException e) 
                {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
