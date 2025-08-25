/*
Problem Statement
Given two strings s1 and s2, find the length of their longest subsequence present in both strings.
A subsequence is a sequence that appears in the same order but not necessarily consecutively.
You don’t need to keep elements contiguous, but order matters.

s1 = "abcde"
s2 = "ace"
Longest Common Subsequence = "ace" → length = 3


  */

import java.util.*;

public class Main 
{
    public static int LCS(String t1, String t2) 
    {
       int l1 = t1.length();
       int l2 = t2.length();
       
       int dp[][] = new int[l1+1][l2+1];
       for(int i = 1 ; i <= l1; i++)
       {
          for(int j = 1; j <= l2; j++) 
          {
              if(t1.charAt(i - 1) == (t2.charAt(j - 1)))
              {
                  
                  dp[i][j] = dp[i-1][j-1] + 1;
                  System.out.println("i:" + i + " j:" + j + " dp[i][j]: " + dp[i][j]);
              }
              else
              {
                  dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                  System.out.println("i:" + i + " j:" + j + " dp[i][j]: " + dp[i][j]);
              }
          }
       }
       
       return dp[l1][l2];
    }

    public static void main(String[] args) 
    {
        String s1 = "abcde";
        String s2 = "ace";
        int res = LCS(s1, s2);
        System.out.println("res: " + res);
    }
}
