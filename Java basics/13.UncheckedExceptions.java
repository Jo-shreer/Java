/*
Unchecked Exceptions
1. Checked at runtime.
2. These are subclasses of RuntimeException.
3. You are not forced to handle or declare them.
4. Common examples: ArithmeticException, NullPointerException,
   ArrayIndexOutOfBoundsException.
*/


public class UncheckedExceptionDemo 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[3];
        System.out.println(arr[5]);  // Throws ArrayIndexOutOfBoundsException
    }
}

op
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
Index 5 out of bounds for length 3
at UncheckedExceptionDemo.main(UncheckedExceptionDemo.java:4)
  
