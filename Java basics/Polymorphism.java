class Animal 
{
    void sound() 
    {
        System.out.println("Some sound");
    }
}

public class Cat extends Animal 
{
    void sound() 
    {
        System.out.println("Meow");
    }

    public static void main(String[] args) 
    {
        Animal a = new Cat();  
        a.sound();            
    }
}


op
  Meow
  
