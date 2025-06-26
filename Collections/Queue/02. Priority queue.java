/*
Thread-safe: ❌ No
Ordering: ✅ Sorted by natural/comparator priority
Duplicates: ✅ Allowed
Time complexity: O(log n) for insertion and removal
Usage: For scheduling or task prioritization

🔑 Key Methods:
boolean add(E e)
boolean offer(E e)
E poll()
E remove()
E peek()
E element()
boolean contains(Object o)
int size()
boolean isEmpty()
void clear()

*/

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo 
{
    public static void main(String[] args) 
    {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Peek: " + queue.peek());
    }
}


Queue: [10, 30, 20]
Removed: 10
Peek: 20
  
