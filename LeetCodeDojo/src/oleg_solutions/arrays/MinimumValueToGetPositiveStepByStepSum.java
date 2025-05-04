package oleg_solutions.arrays;

public class MinimumValueToGetPositiveStepByStepSum {
    public static int solution(int[] nums) {
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int ans = 0;
        long cur = Integer.MAX_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            cur = Math.min(cur, prefix[i]);
        }
        ans = (cur > 0) ? 1 : (int) (1 - cur);
        return ans;
    }
}
