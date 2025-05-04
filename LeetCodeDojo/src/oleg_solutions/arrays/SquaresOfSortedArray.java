package oleg_solutions.arrays;

public class SquaresOfSortedArray {
    public static int[] solution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        if (nums.length == 1) {
            nums[0] = nums[0] * nums[0];
            return nums;
        }
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];

        while (i <= j) {
            if (Math.abs(nums[i]) < Math.abs(nums[j])) {
                result[k] = nums[j] * nums[j];
                j--;
            } else {
                result[k] = nums[i] * nums[i];
                i++;
            }
            k--;
        }

        return result;
    }
}
