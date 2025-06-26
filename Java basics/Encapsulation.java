public class Person 
{
    private String name; 
  
    public String getName() 
    {
        return name;
    }
    public void setName(String newName) 
  {
        name = newName;
    }

    public static void main(String[] args) 
    {
        Person p = new Person();
        p.setName("Alice");
        System.out.println("Name: " + p.getName());
    }
}
