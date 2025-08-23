/*
Problem Statement
Given an integer array nums, move all 0s to the end of it while maintaining the relative order of the non-zero elements.
⚠️ Do this in-place without making a copy of the array.

Input:  [0,1,0,3,12]
Output: [1,3,12,0,0]

*/
import java.util.*;

public class Main
{
    public static void moveZeros(int arr[])
    {
        int size = arr.length;
        int index = 0;
        for(int i =0; i < size; i++)
        {
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < size)
        {
            arr[index] = 0;
            index++;
        }
        
    }
    public static void main(String args[])
    {
        int arr[] = {0,1,0,3,12};
        moveZeros(arr);
        System.out.println("res1:" + Arrays.toString(arr));
    }
}

op
res1:[1, 3, 12, 0, 0]
