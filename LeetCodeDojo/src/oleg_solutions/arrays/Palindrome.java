package oleg_solutions.arrays;

/*
Example 1: Given a string s, return true if it is a palindrome, false otherwise.
A string is a palindrome if it reads the same forward as backward.
That means, after reversing it, it is still the same string.
For example: "abcdcba", or "racecar".
 */

public class Palindrome {
    public static boolean solution(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}