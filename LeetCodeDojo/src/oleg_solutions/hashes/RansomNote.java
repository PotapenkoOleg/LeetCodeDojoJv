package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static boolean solution(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            map.merge(magazine.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char cur = ransomNote.charAt(i);
            if (map.containsKey(cur)) {
                int value = map.get(cur);
                if (value == 0) {
                    return false;
                } else {
                    map.put(cur, value - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
