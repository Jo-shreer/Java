/*
Thread-safe: ✅ Yes
Ordering: ✅ Maintains insertion order
Duplicates: ❌ Not allowed
Time complexity: O(n) for write, O(1) for read
Usage: Safe for iteration in multithreaded environments


boolean add(E e)
boolean remove(Object o)
boolean contains(Object o)
void clear()
int size()
boolean isEmpty()
Iterator<E> iterator()
Object[] toArray()
<T> T[] toArray(T[] a)

*/
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo 
{
    public static void main(String[] args) 
   {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate ignored
        System.out.println("CopyOnWriteArraySet: " + set);
    }
}


CopyOnWriteArraySet: [Apple, Banana]
  
