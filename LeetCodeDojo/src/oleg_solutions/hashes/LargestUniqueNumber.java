package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {
    public static int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        int ans = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}
