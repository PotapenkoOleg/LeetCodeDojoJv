package oleg_solutions.hashes;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountingElements {
    public static int solution(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (var key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int ans = 0;
        for (var key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                ans += map.get(key);
            }
        }
        return ans;
    }
}
