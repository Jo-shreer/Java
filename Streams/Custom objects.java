// EmployeeStreamDemo.java

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Employee 
{
    String name;
    String department;
    int age;
    double salary;

    Employee(String name, String department, int age, double salary) 
    {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() 
    {
        return name + " | " + department + " | Age: " + age + " | Salary: $" + salary;
    }
}

public class EmployeeStreamDemo 
{
    public static void main(String[] args) 
    {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 30, 50000),
            new Employee("Bob", "IT", 25, 60000),
            new Employee("Charlie", "IT", 35, 70000),
            new Employee("Diana", "Finance", 28, 65000),
            new Employee("Evan", "HR", 32, 48000),
            new Employee("Fay", "Finance", 45, 80000)
        );

        // 🔹 1. Filter employees older than 30
      
        System.out.println("Employees older than 30:");
        employees.stream()
                 .filter(e -> e.age > 30)
                 .forEach(System.out::println);

      
        // 🔹 2. List of employee names in uppercase
      
        System.out.println("\nEmployee Names in Uppercase:");
        List<String> upperNames = employees.stream()
                                           .map(e -> e.name.toUpperCase())
                                           .collect(toList());
        System.out.println(upperNames);

        // 🔹 3. Group employees by department
      
        System.out.println("\nEmployees Grouped by Department:");
        Map<String, List<Employee>> deptGroup = 
                                         employees.stream()
                                        .collect(groupingBy(e -> e.department));
      
        deptGroup.forEach((dept, empList) -> 
        {
            System.out.println(dept + ":");
            empList.forEach(System.out::println);
        });

        // 🔹 4. Average salary per department
      
        System.out.println("\nAverage Salary by Department:");
        Map<String, Double> avgSalary = 
                    employees.stream()
       .collect(groupingBy(e -> e.department, averagingDouble(e -> e.salary)));
      
        avgSalary.forEach((dept, avg) -> System.out.println(dept + ": $" + avg));

        // 🔹 5. Sort employees by salary (descending)
      
        System.out.println("\nEmployees Sorted by Salary (High to Low):");
        employees.stream()
                 .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                 .forEach(System.out::println);
    }
}
