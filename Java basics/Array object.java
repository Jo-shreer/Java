public class Student 
{
    String name;
    int age;

    Student(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    void display() 
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) 
    {
        Student students[] = new Student[3];
        students[0] = new Student("Alice", 21);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 20);

        for (int i = 0; i < students.length; i++) 
        {
            students[i].display();
        }
    }
}
