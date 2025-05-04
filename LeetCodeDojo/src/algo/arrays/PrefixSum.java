package algo.arrays;

public class PrefixSum {

    // Build a Prefix Sum
    public long[] fn(int[] nums) {
        long[] prefix = new long[nums.length]; // int[] overflows and gives invalid results
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        return prefix;
    }
}
