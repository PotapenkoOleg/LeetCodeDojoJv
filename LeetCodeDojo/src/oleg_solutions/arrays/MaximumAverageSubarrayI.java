package oleg_solutions.arrays;

public class MaximumAverageSubarrayI {
    // 17 min
    public static Double solution(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return null;
        }
        int ans;
        int cur = 0;
        for (int i = 0; i < k; i++) {
            cur += nums[i];
        }
        ans = cur;
        for (int i = k; i < nums.length; i++) {
            cur += nums[i];
            cur -= nums[i - k];
            ans = Math.max(ans, cur);
        }
        return (1.0 * ans) / k;
    }
}