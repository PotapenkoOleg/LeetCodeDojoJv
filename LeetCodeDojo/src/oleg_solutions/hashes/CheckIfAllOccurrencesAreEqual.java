package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfAllOccurrencesAreEqual {
    public static boolean solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (var ch : s.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == 1;
    }
}
