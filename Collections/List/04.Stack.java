/*
Thread-Safe: ✅ Yes
Insertion Order: ✅ LIFO
Duplicates: ✅ Allowed
Access Time: O(1)
Insert/Delete: O(1) for push() / pop()
Best For: Undo/Redo, backtracking, LIFO logic
*/

import java.util.*;

public class StackDemo 
{
    public static void main(String[] args) 
  {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Top: " + stack.pop()); // LIFO
    }
}


op
Top: Second
  
