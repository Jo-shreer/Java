/*
✅ ConcurrentSkipListMap Example in Java

- ConcurrentSkipListMap is a thread-safe, **sorted map**.
- It implements NavigableMap (like TreeMap) but is concurrent.
- Keys are always kept in **sorted order**.
- Safe for concurrent read/write without explicit synchronization.
*/

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample 
{
    public static void main(String[] args) 
    {
        // Create a ConcurrentSkipListMap
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Add elements
        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(4, "Mango");
        map.put(2, "Cherry");

        // Iteration is always in sorted order of keys
        System.out.println("Sorted Map:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        // Concurrent operations
        Thread writer = new Thread(() -> 
        {
            for (int i = 5; i <= 7; i++) 
            {
                map.put(i, "Fruit-" + i);
                System.out.println("Writer added: " + i);
                try 
                { 
                    Thread.sleep(100); 
                 } catch (InterruptedException e) {}
            }
        });

        Thread reader = new Thread(() -> 
        {
            for (int i = 1; i <= 7; i++) 
            {
                System.out.println("Reader read: " + i + " => " + map.get(i));
                try 
                { 
                    Thread.sleep(80); 
                } 
                catch (InterruptedException e) {}
            }
        });

        writer.start();
        reader.start();

        try 
        {
            writer.join();
            reader.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("\nFinal Map (Sorted):");
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

/*
🖨️ SAMPLE OUTPUT (order may vary):
Sorted Map:
1 => Apple
2 => Cherry
3 => Banana
4 => Mango
Reader read: 1 => Apple
Reader read: 2 => Cherry
Writer added: 5
Reader read: 5 => Fruit-5
...
Final Map (Sorted):
1 => Apple
2 => Cherry
3 => Banana
4 => Mango
5 => Fruit-5
6 => Fruit-6
7 => Fruit-7
*/
