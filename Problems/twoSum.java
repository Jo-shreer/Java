package Problems;

import java.util.HashMap;
import java.util.Map;

public class twosum 
{
    public static int[] twosum(int abc[], int sum)
    {
        Map<Integer, Integer> m1 = new HashMap<>();
        for(int i =0; i < abc.length; i++)
        {
            int complement = sum - abc[i];
            if(m1.containsKey(complement))
            {
                return new int[] { m1.get(complement), i};
            }
            m1.put(abc[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args)
    {
        int arr[] ={1,5,8,6};
        int k = 13;
        int result[] = twosum(arr, k);
        for(int res : result)
        {
            System.out.println("result:" + res);
        }
    }
}

op
result:1
result:2
