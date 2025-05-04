package oleg_solutions.greedy;

import java.util.Arrays;

public class PartitionArrayWithMaxDiffK {
    public static int solution(int[] nums, int k) {
        Arrays.sort(nums);
        var num = nums[0];
        var ans = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > num + k) {
                ans++;
                num = nums[i];
            }
        }
        return ans;
    }
}
