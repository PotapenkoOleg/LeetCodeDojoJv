package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubarrays {
    public static int solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int cur = 0;
        int ans = 0;
        for (int n : nums) {
            cur += n % 2;
            ans += map.getOrDefault(cur - k, 0);
            map.merge(cur, 1, Integer::sum);
        }
        return ans;
    }
}
