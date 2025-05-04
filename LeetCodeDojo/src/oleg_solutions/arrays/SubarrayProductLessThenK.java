package oleg_solutions.arrays;

public class SubarrayProductLessThenK {
    public static int solution(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 2) {
            return 0;
        }
        int left = 0;
        int ans = 0;
        int cur = 1;

        for (int right = 0; right < nums.length; right++) {
            cur *= nums[right];
            while (cur >= k) {
                cur /= nums[left];
                left++;
            }
            ans += right - left + 1;
        }

        return ans;
    }
}
