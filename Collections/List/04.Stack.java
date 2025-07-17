/*
Thread-Safe: ✅ Yes
Insertion Order: ✅ LIFO
Duplicates: ✅ Allowed
Access Time: O(1)
Insert/Delete: O(1) for push() / pop()
Best For: Undo/Redo, backtracking, LIFO logic
*/

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Top Element: " + stack.peek());  // C

        // Pop element
        System.out.println("Popped: " + stack.pop());        // C

        // Check stack contents
        System.out.println("Current Stack: " + stack);       // [A, B]

        // Search
        System.out.println("Position of A: " + stack.search("A"));  // 2

        // Check empty
        System.out.println("Is Empty: " + stack.empty());    // false
    }
}

op
Top Element: C
Popped: C
Current Stack: [A, B]
Position of A: 2
Is Empty: false
    
