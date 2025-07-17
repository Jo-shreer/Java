/*
✅ LinkedHashMap in Java (Single-click Copy Format)

🔹 What is LinkedHashMap?
- It is a subclass of HashMap.
- Maintains the **insertion order** of keys.
- Stores key-value pairs like HashMap.
- Not thread-safe.
- Allows one null key and multiple null values.

🔹 Package & Declaration:
import java.util.LinkedHashMap;

LinkedHashMap<KeyType, ValueType> map = new LinkedHashMap<>();

🔹 Key Features:
- Maintains **insertion order** (order in which keys were added).
- Faster iteration compared to HashMap due to predictable ordering.
- Accepts one null key.
- Not synchronized (use external sync if needed).

🔹 Common Methods:
- put(K key, V value)
- get(Object key)
- remove(Object key)
- containsKey(Object key)
- containsValue(Object value)
- size()
- keySet()
- entrySet()

🔹 When to Use:
- When you need a map with predictable iteration order.
- When ordering matters (like caching, LRU).
- For maintaining form input fields, history, etc.

🔹 Example:
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("One", 10); // Duplicate key, value will be updated

        // Iterating in insertion order
        System.out.println("LinkedHashMap Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
        {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Checking for a key
        System.out.println("Contains 'Two'? " + map.containsKey("Two")); // true

        // Removing an entry
        map.remove("Three");

        // Final Map
        System.out.println("Final Map: " + map);
    }
}

/*
🔹 Output:
LinkedHashMap Entries:
One → 10
Two → 2
Three → 3
Contains 'Two'? true
Final Map: {One=10, Two=2}
*/

/*
🔹 Notes:
- LinkedHashMap maintains predictable ordering.
- Use for caching with predictable iteration.
- Use LinkedHashMap with access-order = true for LRU cache (advanced).
*/
