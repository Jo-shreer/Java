/*
✅ TreeMap in Java (Single-click Copy Format)

🔹 What is TreeMap?
- A part of java.util package.
- Stores key-value pairs in **sorted order of keys**.
- Implements `NavigableMap`, which extends `SortedMap`.
- Based on a **Red-Black Tree** (self-balancing binary search tree).

🔹 Package & Declaration:
import java.util.TreeMap;

TreeMap<KeyType, ValueType> map = new TreeMap<>();

🔹 Key Features:
- Keys are stored in **ascending (natural) order** by default.
- Can sort using a **custom Comparator**.
- ❌ **Does NOT allow null keys** (throws `NullPointerException`).
- ✅ Allows multiple null values.
- Not thread-safe (use `Collections.synchronizedMap()` if needed).

🔹 Time Complexity:
- put(), get(), remove() → O(log n)

🔹 When to Use:
- When you need keys sorted.
- Range queries, navigation (first, last, higher, lower).
- Examples: dictionary, leaderboards, intervals.

🔹 Common Methods:
- put(K key, V value)
- get(K key)
- remove(K key)
- containsKey(K key)
- firstKey(), lastKey()
- higherKey(K key), lowerKey(K key)
- keySet(), entrySet()

🔹 Example:
*/

import java.util.TreeMap;

public class TreeMapExample 
{
    public static void main(String[] args) 
    {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Banana", 20);
        map.put("Apple", 10);
        map.put("Cherry", 30);
        // map.put(null, 50); // ❌ NullPointerException

        // Natural key order (alphabetical)
        
        System.out.println("TreeMap in Sorted Order:");
        for (String key : map.keySet()) 
        {
            System.out.println(key + " → " + map.get(key));
        }

        // Navigation methods
        System.out.println("\nFirst Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Higher than 'Apple': " + map.higherKey("Apple"));
    }
}

/*
🔹 Output:
TreeMap in Sorted Order:
Apple → 10
Banana → 20
Cherry → 30

First Key: Apple
Last Key: Cherry
Higher than 'Apple': Banana
*/

/*
🔹 Summary:
✔ Maintains natural or custom sorted order of keys.
✔ Useful when key order matters.
❌ Null keys not allowed.
✔ Good for range views and navigation.
*/
