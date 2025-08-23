/*
1. Brute Force (O(n²)):
Loop through all pairs (i, j).
Check if nums[i] + nums[j] == target.
If yes → return [i, j].
Very simple, but slow for large arrays.

2. Efficient Approach with HashMap (O(n)):
Use a HashMap to store numbers and their indices.
For each element:
Compute the complement → target - nums[i].
Check if this complement already exists in the map.
If yes → we found the pair, return [map.get(complement), i].
If not → store the current number and its index in the map.
This way, we only loop through once.
*/

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
