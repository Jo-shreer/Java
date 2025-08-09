Garbage collection frees memory occupied by objects that are no longer reachable (no references pointing to them).
But if your program unintentionally keeps references to objects, GC can’t reclaim them.

Common Causes of Memory Leaks in Java:
# 1. Unintentional strong references
Holding objects in collections (like List, Map, Set) without removing them.
Example: Adding objects to a static List and never clearing it.

public class DataHolder 
{
    // Static list holding references to Person objects
    private static List<Person> personList = new ArrayList<>();

    public static void addPerson(Person p) 
    {
        personList.add(p);
    }
}

# What’s the problem here?
personList is static, so it lives as long as the class is loaded (usually the entire application lifetime).
Every Person you add to personList is strongly referenced by this list.
Even if no other part of your program uses those Person objects, the list holds strong references to them.
Because of that, the garbage collector cannot free those Person objects, 
leading to increasing memory usage — a memory leak.


