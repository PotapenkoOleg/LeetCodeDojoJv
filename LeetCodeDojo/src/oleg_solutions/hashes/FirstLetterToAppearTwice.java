package oleg_solutions.hashes;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public static char solution(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (set.contains(cur)) {
                return cur;
            }
            set.add(cur);
        }
        return '_';
    }
}
