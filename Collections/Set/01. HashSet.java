/*
Thread-Safe: ❌ No
Ordering: ❌ No guaranteed order
Duplicates: ❌ Not allowed
Time Complexity: O(1) average (add, remove, contains)
Benefits: Fast, hash-based set
Usage: Use when order doesn’t matter and duplicates aren’t allowed

boolean add(E e)
boolean remove(Object o)
boolean contains(Object o)
void clear()
int size()
boolean isEmpty()
Iterator<E> iterator()
Object[] toArray()
<T> T[] toArray(T[] a)
boolean addAll(Collection<? extends E> c)
boolean removeAll(Collection<?> c)
boolean retainAll(Collection<?> c)

*/

import java.util.*;

public class HashSetDemo 
{
    public static void main(String[] args) 
  {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored
        System.out.println(set);
    }
}

op
[Banana, Apple]
  
