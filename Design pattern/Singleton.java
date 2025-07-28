/*
✅ SINGLETON DESIGN PATTERN — Full Explanation (Copy-Ready)

🔹 What is Singleton?
Ensures a class has only **one instance**, and provides a **global access point** to it.

🔹 Real-World Analogy:
Think of a Printer Spooler or Logger — only one instance should exist at a time.

🔸 Use Cases:
- Database connection manager
- Logging service
- Configuration manager
- Thread pool

-----------------------------------
📐 UML DIAGRAM

┌──────────────────────────┐
│        Singleton         │
├──────────────────────────┤
│ - instance: Singleton    │   ← private static field
├──────────────────────────┤
│ + getInstance(): Singleton │ ← public static accessor
│ + showMessage(): void    │   ← example method
└──────────────────────────┘

-----------------------------------
✅ JAVA CODE — Lazy Initialization Singleton
*/

public class Singleton 
{
    // 🔒 Step 1: private static instance
    private static Singleton instance;

    // 🚫 Step 2: private constructor
    private Singleton() 
    {
        System.out.println("Singleton instance created!");
    }

    // 🧵 Step 3: public static accessor
    public static Singleton getInstance()   
    {
        if (instance == null) 
        {
            instance = new Singleton(); // lazy initialization
        }
        return instance;
    }

    // Example method
    public void showMessage() 
    {
        System.out.println("Hello from Singleton!");
    }
}

// 🔽 Main class to test Singleton
class Main 
{
    public static void main(String[] args) 
    {
        Singleton s1 = Singleton.getInstance();  // First time → creates instance
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();  // Second time → returns same instance
        s2.showMessage();

        System.out.println("Are s1 and s2 same? " + (s1 == s2)); // true
    }
}

-----------------------------------
🖨️ OUTPUT:

Singleton instance created!
Hello from Singleton!
Hello from Singleton!
Are s1 and s2 same? true

-----------------------------------
✅ Summary:

🔸 Only one instance is created.
🔸 Access via `getInstance()` method.
🔸 Constructor is private.
🔸 Multiple calls return the same object.

*/
  
