package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int solution(String s) {
        // |a|b|c|a|b|c|b|b|
        var arr = s.toCharArray();
        var left = 0;
        var ans = 0;
        var cur = ' ';
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < arr.length; right++) {
            cur = arr[right];
            while (set.contains(cur)) {
                set.remove(arr[left]);
                left++;
            }
            set.add(cur);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public static int solution2(String s) {
        // |a|b|c|a|b|c|b|b|
        var arr = s.toCharArray();
        var left = 0;
        var ans = 0;
//        char cur;
//        Map<Character, Integer> set = new HashMap<>();
//        for (int right = 0; right < arr.length; right++) {
//            cur = arr[right];
//            while (set.contains(cur)) {
//                set.remove(arr[left]);
//                left++;
//            }
//            set.add(cur);
//            ans = Math.max(ans, right - left + 1);
//        }
        return ans;
    }
}
