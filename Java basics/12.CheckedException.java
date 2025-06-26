/*
Checked Exceptions
1. Checked at compile-time.
2. The compiler forces you to handle them (with try-catch) 
   or declare them (with throws).
3. Usually related to external resources like files, network, database.
*/


import java.io.*;

public class CheckedExceptionDemo 
{
    public static void main(String[] args) 
   {
        try 
        {
            FileReader file = new FileReader("nonexistent.txt");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found!");
        }
    }
}

op
File not found!
  
