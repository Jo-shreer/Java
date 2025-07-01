class MyThread extends Thread 
{
    public void run() 
    {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread();
        t1.start(); // starts the new thread and calls run()
    }
}
