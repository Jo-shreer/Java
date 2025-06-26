/*
Thread-safe: ❌ No
Ordering: ✅ Insertion order
Duplicates: ❌ Not allowed
Time complexity: O(1) average
Usage: When order matters + no duplicates


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
import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
    public static void main(String[] args) 
    {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate ignored
        System.out.println("LinkedHashSet: " + set);
    }
}



LinkedHashSet: [Apple, Banana]
  
