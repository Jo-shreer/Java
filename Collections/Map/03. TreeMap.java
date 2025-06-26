/*
Thread-Safe: ❌ No
Ordering: ✅ Sorted by keys (natural order or custom comparator)
Duplicate Keys: ❌ No
Time Complexity: O(log n) for get/put/remove
Benefits: Sorted map, supports range queries
Usage: Use when sorted order of keys is needed

Methods
Comparator<? super K> comparator()
K firstKey()
K lastKey()
SortedMap<K,V> subMap(K fromKey, K toKey)
SortedMap<K,V> headMap(K toKey)
SortedMap<K,V> tailMap(K fromKey)

*/

import java.util.*;

public class TreeMapDemo 
{
    public static void main(String[] args) 
   {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 1);
        map.put("Cherry", 3);
        System.out.println(map);
    }
}
