// Parent class
class Animal 
{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
public class Dog extends Animal 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.sound();
    }
}
