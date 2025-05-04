package oleg_solutions.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestSubarrayWithDiff {
    public static int solution(int[] nums, int limit) {
        Deque<Integer> increasing = new ArrayDeque<>();
        Deque<Integer> decreasing = new ArrayDeque<>();
        var left = 0;
        var ans = 0;
        for (var right = 0; right < nums.length; right++) {
            while (!increasing.isEmpty() && increasing.getLast() > nums[right]) {
                increasing.removeLast();
            }
            while (!decreasing.isEmpty() && decreasing.getLast() < nums[right]) {
                decreasing.removeLast();
            }
            increasing.addLast(nums[right]);
            decreasing.addLast(nums[right]);
            while (decreasing.getFirst() - increasing.getFirst() > limit) {
                if (increasing.getFirst() == nums[left]) {
                    increasing.removeFirst();
                }
                if (decreasing.getFirst() == nums[left]) {
                    decreasing.removeFirst();
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
