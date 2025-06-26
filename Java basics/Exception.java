public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        try 
        {
            int data = 100 / 0;  // This will cause ArithmeticException
            System.out.println(data);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide by zero!");
        } 
        finally 
        {
            System.out.println("Finally block executed.");
        }
    }
}

op
Cannot divide by zero!
Finally block executed.
  
