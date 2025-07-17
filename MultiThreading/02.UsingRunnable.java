/*
✅ Multithreading in Java (Single-click Copy Format)

🔹 What is Multithreading?
- Running multiple threads (lightweight processes) concurrently within a program.
- Allows parallel execution to improve performance.
- Threads share the same memory space but have their own execution stack.

🔹 Why Use Multithreading?
- Better resource utilization.
- Improved application performance.
- Useful for tasks like background processing, GUI responsiveness, server request handling.

🔹 Ways to Create Threads in Java:
1. Extending Thread class
2. Implementing Runnable interface
3. Using Callable and Future (for tasks returning results)

🔹 Thread Lifecycle States:
- New
- Runnable
- Running
- Waiting/Blocked
- Terminated

🔹 Important Thread Methods:
- start(): Begins thread execution.
- run(): Contains thread’s code.
- sleep(ms): Pause thread.
- join(): Wait for thread to finish.
- interrupt(): Interrupts a sleeping/waiting thread.
- synchronized: To control access to shared resources.

🔹 Simple Example (Implement Runnable):

*/

class MyRunnable implements Runnable
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " → Count: " + i);
            try 
              {
                Thread.sleep(500); // Pause for 500ms
              } catch (InterruptedException e) 
              {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class MultithreadingExample 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");

        t1.start();
        t2.start();
    }
}

/*
🔹 Sample Output (order may vary due to concurrency):

Thread-1 → Count: 1
Thread-2 → Count: 1
Thread-1 → Count: 2
Thread-2 → Count: 2
...

🔹 Notes:
- Threads run concurrently; exact order is non-deterministic.
- Use synchronization to avoid race conditions.
- For advanced control, explore Executors, Callable, and Futures.
*/
