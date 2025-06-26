/*
Thread-Safe: ✅ Yes (synchronized)
Insertion Order: ✅ Maintained
Duplicates: ✅ Allowed
Access Time: O(1)
Insert/Delete: O(n)
Best For: Thread-safe applications (legacy code)
*/

import java.util.*;

public class VectorDemo 
{
    public static void main(String[] args) 
    {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("One"); // duplicate allowed
        System.out.println("Vector: " + vector);
    }
}

op
Vector: [One, Two, One]
  
