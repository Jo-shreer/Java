/*
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", length = 3

🔹 Approach (Sliding Window + HashSet)
Use two pointers: left and right to maintain a sliding window.
Use a HashSet to keep track of characters inside the window.
Move right pointer forward:
If character is not in set → add it, update maxLen.
If character already exists → remove from set while moving left until window is valid.
Continue until end of string.
⏱ Time Complexity: O(n)
📦 Space Complexity: O(k) (k = charset size, at most 26 for lowercase / 128 for ASCII)
  */

import java.util.*;

public class Main
{
    public static int longestSubstring(String str1)
    {
        int size = str1.length();
        HashSet<Character> set = new HashSet<>();
        int len = 0, left = 0;
        for(int right = 0; right < size; right++)
        {
            Character c = str1.charAt(right);
            while(set.contains(c))
            {
                System.out.println("s_left: " + c + " left: " + left);
                set.remove(str1.charAt(left));
                System.out.println("set: " + set);
                left++;
            }
            set.add(c);
            len = Math.max(len, right - left + 1);
            System.out.println("s:" + set + "len:" + len);
        }
        
        return len;
    }
    public static void main(String args[])
    {
        String str = "abcabcbb";
        int count = longestSubstring(str);
        System.out.println("count:" + count);
    }
}

op
s:[a] len:1
s:[a, b] len:2
s:[a, b, c] len:3
s_left: a left: 0
set: [b, c]
s:[a, b, c] len:3
s_left: b left: 1
set: [a, c]
s:[a, b, c] len:3
s_left: c left: 2
set: [a, b]
s:[a, b, c] len:3
s_left: b left: 3
set: [b, c]
s_left: b left: 4
set: [c]
s:[b, c]len:3
s_left: b left: 5
set: [b]
s_left: b left: 6
set: []
s:[b]len:3
count:3
