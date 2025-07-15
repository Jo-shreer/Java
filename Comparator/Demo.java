Comparator<T> is a functional interface in Java used to 
define custom sorting logic for objects of class T.

It's typically used with:
Collections.sort(list, comparator)
List.sort(comparator)
Stream.sorted(comparator)
You use it when:
You don’t want to or can’t modify the class (e.g., by implementing Comparable)
You want multiple different sort logics for the same class


// ComparatorDemo.java

import java.util.*;

class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() 
    {
        return name + " (Age: " + age + ")";
    }
}

public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("Diana", 30)
        );

        // 🔹 1. Sort by age (ascending)
        people.sort(Comparator.comparingInt(p -> p.age));

        System.out.println("Sorted by Age (Ascending):");
        people.forEach(System.out::println);

        // 🔹 2. Sort by name (alphabetical)
        people.sort(Comparator.comparing(p -> p.name));

        System.out.println("\nSorted by Name (Alphabetical):");
        people.forEach(System.out::println);

        // 🔹 3. Sort by age (descending), then name
        people.sort(Comparator.comparingInt((Person p) -> p.age).reversed()
                              .thenComparing(p -> p.name));

        System.out.println("\nSorted by Age (Descending), then Name:");
        people.forEach(System.out::println);
    }
}
