public class Calculator 
{
    int add(int a, int b) 
    {
        return a + b;
    }

    double add(double a, double b) 
    {
        return a + b;
    }

    public static void main(String[] args) 
    {
        Calculator calc = new Calculator();
        System.out.println("Sum (int): " + calc.add(5, 3));
        System.out.println("Sum (double): " + calc.add(4.5, 2.3));
    }
}

op
Sum (int): 8
Sum (double): 6.8
  
