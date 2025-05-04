package oleg_solutions.arrays;

public class ReverseString {
    public static void solution(char[] s) {
        if (s == null || s.length == 0) {
            return;
        }
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
