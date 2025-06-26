/*
Thread-Safe: ❌ No
Insertion Order: ✅ Maintained
Duplicates: ✅ Allowed
Access Time: O(n)
Insert/Delete: O(1) (start/end)
Best For: Frequent insertion/deletion
*/

import java.util.*;

public class LinkedListDemo 
{
    public static void main(String[] args) 
  {
        LinkedList<String> list = new LinkedList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Elephant");
        list.addFirst("Ant"); // Insert at beginning
        System.out.println("LinkedList: " + list);
    }
}


op
LinkedList: [Ant, Cat, Dog, Elephant]
  
