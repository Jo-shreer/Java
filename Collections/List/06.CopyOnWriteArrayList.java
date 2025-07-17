/*
✅ CopyOnWriteArrayList in Java (Single-click Copy Format)

🔹 What is it?
- CopyOnWriteArrayList is a thread-safe variant of ArrayList.
- Part of java.util.concurrent package.
- Safe to iterate even while other threads are modifying it.
- Uses a copy-on-write strategy: every write (add/remove) 
  creates a new copy of the underlying array.

🔹 When to Use
- Read-heavy, write-light applications.
- Scenarios where you need safe iteration without locking or synchronization.

🔹 Key Features
- Thread-safe without needing external synchronization.
- No ConcurrentModificationException during iteration.
- More memory-intensive for frequent writes.

🔹 Import
import java.util.concurrent.CopyOnWriteArrayList;

🔹 Common Methods
- add(E e)
- remove(Object o)
- get(int index)
- set(int index, E element)
- size()
- iterator()

🔹 Example
*/

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample 
{
    public static void main(String[] args) 
    {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Safe iteration while modifying the list
        for (String lang : list) 
        {
            System.out.println(lang);
            if (lang.equals("Java")) 
            {
                list.add("Go");  // No ConcurrentModificationException
            }
        }

        System.out.println("Final List: " + list);
    }
}

/*
🔹 Output:
Java
Python
C++
Final List: [Java, Python, C++, Go]

🔹 Summary
✔ Safe for concurrent reads and writes.
✔ No need for manual synchronization.
✔ Prefer it when reads are more frequent than writes.
*/
