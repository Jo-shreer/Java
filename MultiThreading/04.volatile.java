/*
✅ Volatile Keyword in Java (Single-click Copy Format)

🔹 What is `volatile`?
- A keyword to mark a variable as stored in main memory.
- Ensures **visibility** of changes to variables across threads.
- Prevents threads from caching the variable locally.
- Guarantees that every read of a volatile variable sees the 
  most recent write.

🔹 When to Use `volatile`?
- For variables shared between threads that are read and written 
  but don’t require atomicity.
- When you don’t need full synchronization but want visibility.
- Suitable for flags, status indicators, or simple state variables.

🔹 Important Notes:
- `volatile` does NOT make operations atomic (e.g., increment is NOT atomic).
- Use synchronization for compound actions.
- Less overhead than synchronization but only guarantees visibility, 
  not mutual exclusion.

🔹 Example:

*/

class VolatileExample 
{
    private volatile boolean flag = false;

    public void writerThread() 
    {
        System.out.println("Writer thread started");
        try 
        {
            Thread.sleep(1000);  // simulate work
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        flag = true;  // write to volatile variable
        System.out.println("Writer thread updated flag to true");
    }

    public void readerThread() 
    {
        System.out.println("Reader thread started");
        while (!flag) 
        {
            // busy-wait until flag becomes true
        }
        System.out.println("Reader thread detected flag = true");
    }
}

public class VolatileDemo 
{
    public static void main(String[] args) 
    {
        VolatileExample example = new VolatileExample();

        Thread writer = new Thread(() -> example.writerThread());
        Thread reader = new Thread(() -> example.readerThread());

        reader.start();
        writer.start();
    }
}

/*
🔹 Output:
Reader thread started
Writer thread started
Writer thread updated flag to true
Reader thread detected flag = true

🔹 Explanation:
- Without `volatile`, the reader thread might never see the update 
  due to caching.
- `volatile` guarantees visibility of flag update to other threads.
*/
