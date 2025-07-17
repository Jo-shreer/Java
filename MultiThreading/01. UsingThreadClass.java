/*
✅ Multithreading by Extending Thread Class

🔹 Steps:
1. Create a class that extends Thread.
2. Override the run() method with thread code.
3. Create objects of your class and call start() to begin execution.

*/

class MyThread extends Thread 
{
    @Override
    public void run() 
    {
        for(int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " → Count: " + i);
            try 
            {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) 
            {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class ThreadClassExample 
{
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start(); // starts the new thread and calls run()
        t2.start();
    }
}

/*
🔹 Output (order may vary):

Thread-A → Count: 1
Thread-B → Count: 1
Thread-A → Count: 2
Thread-B → Count: 2
...

🔹 Notes:
- Do NOT call run() directly; always call start() to create a new thread.
- Extending Thread means your class cannot extend any other class.
- For more flexibility, consider implementing Runnable.
*/
