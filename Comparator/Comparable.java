Comparable?
Comparable is a Java interface (java.lang.Comparable<T>) used to 
define the natural ordering of objects.
A class implements Comparable to specify how its instances should 
be compared to each other.

It has one method:
int compareTo(T o);
Objects that implement Comparable can be sorted automatically 
(e.g., via Collections.sort()).


import java.util.*;

class Person implements Comparable<Person> 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // Implement compareTo to sort Persons by age
    @Override
    public int compareTo(Person other) 
    {
        return this.age - other.age;  // Ascending order by age
    }

    @Override
    public String toString() 
    {
        return name + " (" + age + ")";
    }
}

public class ComparableExample 
{
    public static void main(String[] args) 
    {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        Collections.sort(people);  // Sorts using compareTo

        for (Person p : people) {
            System.out.println(p);
        }
    }
}

  
