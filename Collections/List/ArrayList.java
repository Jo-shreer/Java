/*
Thread-Safe: ❌ No
Insertion Order: ✅ Maintained
Duplicates: ✅ Allowed
Access Time: O(1)
Insert/Delete: O(n)
Best For: Fast random access (index-based)
*/


import java.util.*;

public class ListExample 
{
  public static void main(String[] args) 
  {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicates allowed

        System.out.println("Fruits: " + fruits);
    }
}

op
Fruits: [Apple, Banana, Apple]
  
