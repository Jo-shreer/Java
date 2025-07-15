import java.util.Comparator;

public class ComparatorSimpleExample 
{
    public static void main(String[] args) 
    {
        // Comparator to compare strings by length
        Comparator<String> compareByLength = (s1, s2) -> s1.length() - s2.length();

        String str1 = "apple";
        String str2 = "banana";

        int result = compareByLength.compare(str1, str2);

        if (result < 0) 
        {
            System.out.println(str1 + " is shorter than " + str2);
        } 
        else if (result > 0) 
        {
            System.out.println(str1 + " is longer than " + str2);
        } 
        else 
        {
            System.out.println(str1 + " and " + str2 + " have the same length");
        }
    }
}

op
apple is shorter than banana
  
