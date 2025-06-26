/*
Thread-Safe: ✅ Synchronized
Ordering: ❌ No guaranteed order
Duplicate Keys: ❌ No
Time Complexity: O(1) average
Benefits: Thread-safe legacy class (rarely recommended now)
Usage: Legacy apps requiring thread safety


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

public class HashtableDemo 
{
    public static void main(String[] args) 
    {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("Apple", 1);
        table.put("Banana", 2);
        System.out.println(table);
    }
}
