package oleg_solutions.arrays;

public class WaysToSplitArray {
    public static int solution(int[] nums) {
        int ans = 0;
        long leftSection = 0;
        long total = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            leftSection += nums[i];
            long rightSection = total - leftSection;
            if (leftSection >= rightSection) {
                ans++;
            }
        }

        return ans;
    }

    public static int solution1(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int ans = 0;
        int total = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= total - nums[i]) {
                ans++;
            }
        }
        return ans;

    }

    public static int solution2(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int ans = 0;
        long total = prefix[nums.length - 1];
        for (int i = 0; i < prefix.length - 1; i++) {
            if (prefix[i] >= (total - prefix[i])) {
                ans++;
            }
        }
        return ans;
    }
}
