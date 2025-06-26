/*
Thread-safe: ❌ No
Ordering: ✅ FIFO (First-In-First-Out)
Duplicates: ✅ Allowed
Time complexity: O(1) for add, poll, peek
Usage: General-purpose queue (non-thread-safe), 
supports both queue & deque operations

boolean add(E e)
boolean offer(E e)
E poll()
E remove()
E peek()
E element()
int size()
boolean isEmpty()
void clear()

*/
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo 
{
    public static void main(String[] args) 
    {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Peek: " + queue.peek());
    }
}


Queue: [A, B, C]
Removed: A
Peek: B
  
