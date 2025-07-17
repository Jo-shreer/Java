/*
✅ ConcurrentHashMap in Java (Single-click Copy Format)

🔹 What is ConcurrentHashMap?
- A thread-safe variant of HashMap.
- Part of `java.util.concurrent` package.
- Allows concurrent read and write operations without locking the entire map.
- Uses internal segmentation or bin-level locking for better concurrency.
- Does **NOT allow null keys or null values**.

🔹 Package & Declaration:
import java.util.concurrent.ConcurrentHashMap;

ConcurrentHashMap<KeyType, ValueType> map = new ConcurrentHashMap<>();

🔹 Key Features:
- Thread-safe with high concurrency.
- No locking of the entire map for updates.
- Does NOT allow null keys or values (throws NullPointerException).
- Provides atomic operations like `putIfAbsent`, `remove(key, value)`.
- Iterators are **weakly consistent** (reflect some but not necessarily
  all changes).

🔹 When to Use:
- Multi-threaded applications requiring concurrent access to a map.
- When high performance under concurrency is important.
- Replacement for synchronizedMap or Hashtable in most cases.

🔹 Common Methods:
- put(K key, V value)
- get(Object key)
- remove(Object key)
- putIfAbsent(K key, V value)
- replace(K key, V oldValue, V newValue)
- computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
- size()

🔹 Example:
*/

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample 
{
    public static void main(String[] args) 
    {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding entries
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Atomic putIfAbsent
        map.putIfAbsent("Banana", 50); // Won't update since "Banana" exists

        // Updating value using replace
        map.replace("Apple", 10, 15);

        // Accessing values
        System.out.println("Apple: " + map.get("Apple"));   // 15
        System.out.println("Banana: " + map.get("Banana")); // 20

        // Iterating safely
        System.out.println("Entries:");
        map.forEach((k, v) -> System.out.println(k + " → " + v));
    }
}

/*
🔹 Output:
Apple: 15
Banana: 20
Entries:
Apple → 15
Banana → 20
Cherry → 30

🔹 Notes:
- Use for thread-safe maps without external synchronization.
- Null keys or values cause NullPointerException.
- Iterators are weakly consistent: reflect state at some point during 
  or after iteration.
*/
