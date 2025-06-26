/*
Thread-safe: ❌ No
Ordering: ✅ Sorted (natural or custom)
Duplicates: ❌ Not allowed
Time complexity: O(log n)
Usage: Sorted unique elements (e.g. leaderboards, ranges)

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
Comparator<? super E> comparator()
E first()
E last()
SortedSet<E> headSet(E toElement)
SortedSet<E> tailSet(E fromElement)
SortedSet<E> subSet(E fromElement, E toElement)

*/

import java.util.TreeSet;

public class TreeSetDemo 
{
    public static void main(String[] args) 
    {
        TreeSet<String> set = new TreeSet<>();
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Apple"); // Duplicate ignored
        System.out.println("TreeSet: " + set);
    }
}


TreeSet: [Apple, Banana, Cherry]
  
