/*
✅ ABSTRACT FACTORY DESIGN PATTERN — Vehicle Example (Copy-Ready)

🔹 Scenario:
Create families of related objects — Vehicles and Engines — for different fuel types.

-----------------------------------
📐 UML DIAGRAM

        ┌───────────────────────────┐
        │        VehicleFactory     │
        │ + createVehicle(): Vehicle│
        │ + createEngine(): Engine  │
        └─────────────┬─────────────┘
                      │
           ┌──────────┴───────────┐
    ┌───────────────┐     ┌───────────────┐
    │ ElectricFactory│     │ GasolineFactory│
    └───────────────┘     └───────────────┘
          │                         │
   ┌──────┴───────┐          ┌──────┴───────┐
   │ ElectricCar  │          │ GasolineCar  │
   │ ElectricEngine│         │ GasolineEngine│
   └──────────────┘          └──────────────┘

-----------------------------------
✅ JAVA CODE — Abstract Factory Vehicle Example
*/

// Abstract products
interface Vehicle 
{
    void drive();
}

interface Engine 
{
    void start();
}

// Concrete products for Electric
class ElectricCar implements Vehicle 
{
    public void drive() 
    {
        System.out.println("Driving an electric car");
    }
}

class ElectricEngine implements Engine 
{
    public void start() 
    {
        System.out.println("Starting electric engine silently");
    }
}

// Concrete products for Gasoline
class GasolineCar implements Vehicle 
{
    public void drive() 
    {
        System.out.println("Driving a gasoline car");
    }
}

class GasolineEngine implements Engine 
{
    public void start() 
    {
        System.out.println("Starting gasoline engine with roar");
    }
}

// Abstract Factory
interface VehicleFactory 
{
    Vehicle createVehicle();
    Engine createEngine();
}

// Concrete Factory for Electric vehicles
class ElectricFactory implements VehicleFactory 
{
    public Vehicle createVehicle() 
    {
        return new ElectricCar();
    }
    public Engine createEngine() 
    {
        return new ElectricEngine();
    }
}

// Concrete Factory for Gasoline vehicles
class GasolineFactory implements VehicleFactory 
{
    public Vehicle createVehicle() 
    {
        return new GasolineCar();
    }
    public Engine createEngine() 
    {
        return new GasolineEngine();
    }
}

// Client code
public class Main 
{
    private static VehicleFactory factory;

    public static void main(String[] args) 
    {
        configure("Electric");
        Vehicle vehicle = factory.createVehicle();
        Engine engine = factory.createEngine();

        vehicle.drive();   // Driving an electric car
        engine.start();    // Starting electric engine silently

        configure("Gasoline");
        vehicle = factory.createVehicle();
        engine = factory.createEngine();

        vehicle.drive();   // Driving a gasoline car
        engine.start();    // Starting gasoline engine with roar
    }

    public static void configure(String type) 
    {
        if (type.equalsIgnoreCase("Electric")) 
        {
            factory = new ElectricFactory();
        } 
        else if (type.equalsIgnoreCase("Gasoline")) 
        {
            factory = new GasolineFactory();
        }
    }
}

-----------------------------------
🖨️ OUTPUT:

Driving an electric car  
Starting electric engine silently  
Driving a gasoline car  
Starting gasoline engine with roar

-----------------------------------
✅ Summary:

✔ Produces related objects (Vehicle + Engine) as a family  
✔ Hides concrete implementation details  
✔ Makes adding new families (e.g., HybridFactory) easy

*/
