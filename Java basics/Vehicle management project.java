interface GPS 
{
    void navigate();
}

abstract class Vehicle 
{
    String brand;
    Vehicle(String brand) 
    {
        this.brand = brand;
    }

    abstract void start();
    void stop() 
    {
        System.out.println(brand + " stopped.");
    }
}

class Car extends Vehicle implements GPS 
{
    Car(String brand) 
    {
        super(brand);
    }

    void start() 
    {
        System.out.println(brand + " car started.");
    }

    public void navigate() 
    {
        System.out.println(brand + " car navigating using GPS.");
    }
}

class Bike extends Vehicle 
{
    Bike(String brand) 
    {
        super(brand);
    }

    void start() 
    {
        System.out.println(brand + " bike started.");
    }
}

class Truck extends Vehicle implements GPS 
{
    Truck(String brand) 
    {
        super(brand);
    }

    void start() 
    {
        System.out.println(brand + " truck started.");
    }

    public void navigate() 
    {
        System.out.println(brand + " truck navigating using GPS.");
    }
}

public class VehicleManagement 
{
    public static void main(String[] args) 
  {
        Vehicle[] vehicles = 
        {
            new Car("Toyota"),
            new Bike("Yamaha"),
            new Truck("Volvo")
        };

        for (Vehicle v : vehicles) 
        {
            v.start();
            v.stop();
            if (v instanceof GPS) 
            {
                ((GPS) v).navigate();
            }

            System.out.println("----------------------");
        }
    }
}


op
Toyota car started.
Toyota stopped.
Toyota car navigating using GPS.
----------------------
Yamaha bike started.
Yamaha stopped.
----------------------
Volvo truck started.
Volvo stopped.
Volvo truck navigating using GPS.
----------------------
  
