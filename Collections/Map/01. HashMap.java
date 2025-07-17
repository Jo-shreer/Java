/*
✅ HashMap in Java (Single-click Copy Format)

🔹 What is HashMap?
- HashMap is a part of java.util package.
- It stores key-value pairs.
- Keys must be unique.
- Allows one null key and multiple null values.
- Not synchronized (not thread-safe).
- Uses a hash table internally for fast access.

🔹 Declaration:
import java.util.HashMap;

HashMap<KeyType, ValueType> map = new HashMap<>();

🔹 Time Complexity (Average Case):
- put()      → O(1)
- get()      → O(1)
- remove()   → O(1)

🔹 Common Methods:
- put(K key, V value)
- get(Object key)
- remove(Object key)
- containsKey(Object key)
- containsValue(Object value)
- size()
- keySet()
- values()
- entrySet()

🔹 When to Use:
- Fast lookups with unique keys.
- When insertion order does not matter.
- When thread safety is not required.

🔹 Example:
*/

import java.util.HashMap;

public class HashMapExample 
{
    public static void main(String[] args) 
    {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Mango", 30);
        map.put("Apple", 60); // Duplicate key (value will be updated)

        // Accessing values
        System.out.println("Apple Price: " + map.get("Apple")); // 60

        // Checking key existence
        System.out.println("Contains Banana? " + map.containsKey("Banana")); // true

        // Iterating over keys and values
        System.out.println("\nItems in Map:");
        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        // Removing a key
        map.remove("Mango");

        // Final map
        System.out.println("\nFinal Map: " + map);
    }
}



/*
🔹 Output:
Apple Price: 60
Contains Banana? true

Items in Map:
Apple → 60
Banana → 20
Mango → 30

Final Map: {Apple=60, Banana=20}
*/

/*
🔹 Notes:
- Not thread-safe. Use Collections.synchronizedMap() or ConcurrentHashMap for multi-threading.
- Iteration order is not guaranteed.
- Accepts one null key.
*/
