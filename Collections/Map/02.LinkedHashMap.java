/*
Thread-Safe: ❌ No
Ordering: ✅ Maintains insertion order
Duplicate Keys: ❌ No
Time Complexity: O(1) average for get/put/remove
Benefits: Keeps insertion order, useful for predictable iteration
Usage: Use when iteration order matters


Methods
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

public class LinkedHashMapDemo 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Apple", 3);
        System.out.println(map);
    }
}
