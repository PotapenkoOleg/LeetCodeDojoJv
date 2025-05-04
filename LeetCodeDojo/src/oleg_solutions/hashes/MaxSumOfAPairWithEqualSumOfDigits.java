package oleg_solutions.hashes;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfAPairWithEqualSumOfDigits {
    public static int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        int cur;
        for (int i = 0; i < nums.length; i++) {
            cur = getSumOfDigits(nums[i]);
            if (map.containsKey(cur)) {
                ans = Math.max(ans, map.get(cur) + nums[i]);
            }
            map.put(cur, Math.max(map.getOrDefault(cur, 0), nums[i]));
        }
        return ans;
    }

    public static int getSumOfDigits(int number) {
        int ans = 0;
        while (number > 0) {
            ans += number % 10;
            number /= 10;
        }
        return ans;
    }
}
