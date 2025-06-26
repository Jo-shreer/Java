public class Student 
{
    String name;
    int age;

    Student(String n, int a) 
    {
        name = n;
        age = a;
    }

    void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) 
    {
        Student s1 = new Student("Ravi", 20);
        s1.displayInfo();
    }
}
output 
Name: Ravi
Age: 20
  
