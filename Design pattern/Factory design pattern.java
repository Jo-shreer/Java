/*
✅ FACTORY DESIGN PATTERN — Full Explanation (Copy-Ready)

🔹 What is Factory Pattern?
Factory Pattern defines an interface for creating objects but allows **subclasses to decide which class to instantiate**.

🧠 Real-World Analogy:
A shape drawing app lets you request a "shape" — the factory decides whether to give you a Circle, Square, or Rectangle.

🔸 Use Cases:
- When object creation logic is complex
- When you don’t want to expose instantiation logic to the client
- When you want to return objects of a **common superclass/interface**

-----------------------------------
📐 UML DIAGRAM

            ┌─────────────┐
            │   Shape     │◄──────────────┐
            └─────────────┘               │
           ▲             ▲               │
   ┌─────────────┐   ┌─────────────┐     │
   │   Circle     │   │  Rectangle  │     │
   └─────────────┘   └─────────────┘     │
                                         ▼
                                ┌────────────────────┐
                                │  ShapeFactory       │
                                └────────────────────┘
                                │ + getShape(String):Shape │

-----------------------------------
✅ JAVA CODE — Factory Pattern Example
*/

// Step 1: Create interface
interface Shape {
    void draw();
}

// Step 2: Implement concrete classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 3: Create Factory class
class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("CIRCLE")) return new Circle();
        if (type.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        return null;
    }
}

// Step 4: Test the Factory
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw(); // Output: Drawing a Circle

        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw(); // Output: Drawing a Rectangle
    }
}

-----------------------------------
🖨️ OUTPUT:

Drawing a Circle  
Drawing a Rectangle

-----------------------------------
✅ Summary:

✔ Centralizes object creation logic  
✔ Reduces tight coupling between client and concrete classes  
✔ Makes the system easier to extend (add new shapes)  
❌ Can lead to too many factory classes in complex systems

*/
