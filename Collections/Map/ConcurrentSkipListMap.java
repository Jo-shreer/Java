/*
✅ ConcurrentSkipListMap in Java (Single-click Copy Format)

🔹 What is ConcurrentSkipListMap?
- A thread-safe, **sorted** map implementation.
- Part of `java.util.concurrent` package.
- Implements `ConcurrentNavigableMap`.
- Uses **skip list** data structure for efficient concurrent access.
- Keys are stored in **sorted order** (natural or via Comparator).
- Supports approximate match operations like `ceilingKey()`, `floorKey()`.
- Does **NOT allow null keys or null values**.

🔹 Package & Declaration:
import java.util.concurrent.ConcurrentSkipListMap;

ConcurrentSkipListMap<KeyType, ValueType> map = new ConcurrentSkipListMap<>();

🔹 Key Features:
- Thread-safe with efficient concurrent reads and writes.
- Sorted key order.
- Lock-free reads, fine-grained locking for updates.
- Supports navigable map operations (headMap, tailMap, subMap).
- No null keys or values allowed.

🔹 When to Use:
- When you need a **thread-safe**, **sorted map**.
- When concurrent sorted operations are required.
- Alternative to synchronized TreeMap in concurrent environment.

🔹 Common Methods:
- put(K key, V value)
- get(Object key)
- remove(Object key)
- firstKey(), lastKey()
- ceilingKey(K key), floorKey(K key)
- headMap(K toKey), tailMap(K fromKey), subMap(K fromKey, K toKey)
- size()

🔹 Example:
*/

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample 
{
    public static void main(String[] args) 
    {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        // Adding entries
        map.put("Banana", 20);
        map.put("Apple", 10);
        map.put("Cherry", 30);

        // Iteration (sorted order)
        System.out.println("ConcurrentSkipListMap (Sorted):");
        map.forEach((k, v) -> System.out.println(k + " → " + v));

        // Navigation examples
        System.out.println("\nFirst Key: " + map.firstKey());   // Apple
        System.out.println("Last Key: " + map.lastKey());       // Cherry
        System.out.println("Ceiling Key of 'Ban': " + map.ceilingKey("Ban")); // Banana
        System.out.println("Floor Key of 'Banana': " + map.floorKey("Banana")); // Banana
    }
}

/*
🔹 Output:
ConcurrentSkipListMap (Sorted):
Apple → 10
Banana → 20
Cherry → 30

First Key: Apple
Last Key: Cherry
Ceiling Key of 'Ban': Banana
Floor Key of 'Banana': Banana

🔹 Notes:
- Thread-safe sorted map, excellent for concurrent access with ordering.
- Null keys/values not allowed.
- Use for concurrent applications needing sorted maps with navigable features.
*/
