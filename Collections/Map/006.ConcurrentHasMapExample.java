/*
✅ ConcurrentHashMap with Concurrent Operations

- Multiple threads safely update and read values at the same time.
- No ConcurrentModificationException.
*/

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapConcurrentOps 
{
    public static void main(String[] args) throws InterruptedException 
    {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Thread 1 → adding entries
        Thread writer1 = new Thread(() -> 
        {
            for (int i = 1; i <= 5; i++) 
            {
                map.put(i, "Value-" + i);
                System.out.println("Writer1 added: " + i);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        // Thread 2 → updating entries
        Thread writer2 = new Thread(() -> 
        {
            for (int i = 1; i <= 5; i++) 
            {
                map.put(i, "Updated-" + i);
                System.out.println("Writer2 updated: " + i);
                try { Thread.sleep(150); } catch (InterruptedException e) {}
            }
        });

        // Thread 3 → reading entries
        Thread reader = new Thread(() -> 
        {
            for (int i = 1; i <= 5; i++) 
            {
                String value = map.get(i);
                System.out.println("Reader read: key=" + i + ", value=" + value);
                try { Thread.sleep(120); } catch (InterruptedException e) {}
            }
        });

        // Start all threads
        writer1.start();
        writer2.start();
        reader.start();

        // Wait for threads to finish
        writer1.join();
        writer2.join();
        reader.join();

        // Final map state
        System.out.println("\nFinal Map:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

/*
🖨️ SAMPLE OUTPUT (order may vary because of concurrency):
Writer1 added: 1
Writer2 updated: 1
Reader read: key=1, value=Updated-1
Writer1 added: 2
Reader read: key=2, value=Value-2
Writer2 updated: 2
...
Final Map:
1 => Updated-1
2 => Updated-2
3 => Updated-3
4 => Updated-4
5 => Updated-5
*/
