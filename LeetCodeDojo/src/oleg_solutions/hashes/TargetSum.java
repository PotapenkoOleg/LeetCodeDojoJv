package oleg_solutions.hashes;

public class TargetSum {
    public static boolean solution(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // curr is the current sum
            int curr = nums[left] + nums[right];
            if (curr == target) {
                return true;
            }

            if (curr > target) {
                right--;
            } else {
                left++;
            }
        }

        return false;
    }
}