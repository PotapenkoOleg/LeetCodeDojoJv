package oleg_solutions.arrays;

public class ArraySumLessThanK {
    public static int solution(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}