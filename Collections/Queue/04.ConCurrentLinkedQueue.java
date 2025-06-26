/*
Thread-safe: ✅ Yes
Ordering: ✅ FIFO
Duplicates: ✅ Allowed
Time complexity: O(1) average
Usage: Best for concurrent producer-consumer tasks

boolean add(E e)
boolean offer(E e)
E poll()
E peek()
boolean isEmpty()
int size()
Iterator<E> iterator()
*/

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueDemo 
{
    public static void main(String[] args) 
    {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("X");
        queue.add("Y");
        queue.add("Z");

        System.out.println("Concurrent Queue: " + queue);
        System.out.println("Polled: " + queue.poll());
        System.out.println("Peek: " + queue.peek());
    }
}



Concurrent Queue: [X, Y, Z]
Polled: X
Peek: Y
  
