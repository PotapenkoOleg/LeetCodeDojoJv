package oleg_solutions.binarySearch;

import java.util.Arrays;

public class LongestSubSeqWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        var n = nums.length;
        var m = queries.length;
        var ans = new int[m];
        Arrays.sort(nums);
        for (var i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        for (var i = 0; i < m; i++) {
            var insertionPoint = binarySearch(nums, queries[i]);
            ans[i] = insertionPoint;
        }
        return ans;
    }

    private int binarySearch(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        while (left < right) {
            var mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid + 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left] > target ? left : left + 1;
    }
}
