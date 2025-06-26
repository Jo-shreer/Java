/*
Doubly Linked list 
Thread-safe: ❌ No
Ordering: ✅ Maintains both ends
Duplicates: ✅ Allowed
Time complexity: O(1)
Usage: For stack/queue-like behavior (both ends supported)

void addFirst(E e)
void addLast(E e)
E removeFirst()
E removeLast()
E peekFirst()
E peekLast()
boolean offerFirst(E e)
boolean offerLast(E e)
E pollFirst()
E pollLast()
int size()
boolean isEmpty()

*/
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo 
{
    public static void main(String[] args) 
    {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.addFirst("B");
        deque.addLast("C");

        System.out.println("Deque: " + deque);
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
    }
}


Deque: [B, A, C]
Removed First: B
Removed Last: C
  
