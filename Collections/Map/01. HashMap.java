/*
Thread-Safe: ❌ No
Ordering: ❌ No guaranteed order
Duplicate Keys: ❌ No (keys unique, values can duplicate)
Time Complexity: O(1) average for get/put/remove
Benefits: Fast, widely used, good general-purpose map
Usage: Use when order does not matter,
thread safety handled externally if needed

key Methods
V put(K key, V value)
V get(Object key)
V remove(Object key)
boolean containsKey(Object key)
boolean containsValue(Object value)
Set<K> keySet()
Collection<V> values()
Set<Map.Entry<K,V>> entrySet()
void clear()
int size()
boolean isEmpty()

*/

import java.util.*;

public class HashMapDemo 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Apple", 3); // overwrites previous value
        System.out.println(map);
    }
}
