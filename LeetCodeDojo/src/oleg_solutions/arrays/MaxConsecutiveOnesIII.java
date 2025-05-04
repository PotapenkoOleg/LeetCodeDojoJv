package oleg_solutions.arrays;

public class MaxConsecutiveOnesIII {
    // 27 min
    public static int solution(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int cur = 0;
        int zeros = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            cur++;
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                cur--;
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}