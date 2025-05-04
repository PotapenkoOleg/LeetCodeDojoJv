package algo.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArraysForCriteria {

    // Find number of Sub Arrays That Fit an Exact Criteria
    public int solution(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int curr = 0;

        for (int num: nums) {
            // do logic to change curr (compute prefix sum)
            ans += counts.getOrDefault(curr - k, 0);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);
        }
        return ans;
    }
}
