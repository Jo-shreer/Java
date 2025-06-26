/*
The Dog class extends Animal.
When you create a new Dog object, the Dog constructor needs to also initialize 
the Animal part.
super(n); calls the constructor of the parent class (Animal) with parameter n.
This sets the name property in Animal.
Without super(n);, you wouldn’t be able to initialize the inherited name 
field properly (unless you explicitly did so in another way).
Also, Java requires that the parent class constructor is called before 
the child class constructor finishes.
*/


class Animal 
{
    String name;
    Animal(String n) 
    {
        name = n;
    }

    void showName() 
    {
        System.out.println("Animal: " + name);
    }
}

public class Dog extends Animal 
{
    String breed;
    Dog(String n, String b) 
    {
        super(n);       // Call parent constructor
        breed = b;
    }

    void showBreed() 
    {
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) 
    {
        Dog d = new Dog("Buddy", "Labrador");
        d.showName();
        d.showBreed();
    }
}

op
Animal constructor called
Dog constructor called
Animal: Buddy
Breed: Labrador
  
  
