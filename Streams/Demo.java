// JavaStreamsDemo.java

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamsDemo 
{
    public static void main(String[] args) 
    {
        // 🔹 Example 1: Filtering a List
        // Use stream to filter elements that start with "A"
      
        List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Charlie");
        System.out.println("Names starting with A:");
        names.stream()
             .filter(name -> name.startsWith("A")) // filter names starting with "A"
             .forEach(System.out::println);        // terminal operation to print each

      
        // 🔹 Example 2: Mapping and Collecting
        // Use map to transform each number (square it), 
        // and collect the result into a new list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squared = numbers.stream()
                                       .map(n -> n * n)                 // square each number
                                       .collect(Collectors.toList());   // collect to list

        System.out.println("\nSquared Numbers:");
        System.out.println(squared); // Output: [1, 4, 9, 16, 25]

      
        // 🔹 Example 3: Reduce Operation
        // Use reduce to calculate the sum of numbers
      
        int sum = numbers.stream()
                         .reduce(0, Integer::sum); // start from 0 and sum all elements

        System.out.println("\nSum of Numbers:");
        System.out.println(sum); // Output: 15

      
        // 🔹 Example 4: Sorting and Distinct
      
        List<Integer> numsWithDuplicates = Arrays.asList(5, 3, 4, 3, 2, 1, 5);
        List<Integer> sortedDistinct = numsWithDuplicates.stream()
                                                         .distinct()      // remove duplicates
                                                         .sorted()        // sort ascending
                                                         .collect(Collectors.toList());

        System.out.println("\nSorted & Distinct:");
        System.out.println(sortedDistinct); // Output: [1, 2, 3, 4, 5]

        // 🔹 Example 5: Using limit and skip
      
        List<Integer> limited = numbers.stream()
                                       .skip(2)        // skip first 2
                                       .limit(2)       // take next 2
                                       .collect(Collectors.toList());

        System.out.println("\nSkipped 2 and Took 2:");
        System.out.println(limited); // Output: [3, 4]
    }
}
