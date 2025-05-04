package oleg_solutions.hashes;
// https://leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexes.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int cur = target - nums[i];
            if (indexes.containsKey(cur) && (indexes.get(cur) != i)) {
                return new int[]{i, indexes.get(cur)};
            }
        }
        return new int[]{-1, -1};
    }
}