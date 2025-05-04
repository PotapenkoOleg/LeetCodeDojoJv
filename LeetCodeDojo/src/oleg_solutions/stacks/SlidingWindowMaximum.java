package oleg_solutions.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] solution(int[] nums, int k) {
        var ans = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (var i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(i);
            if (deque.getFirst() == i - k) {
                deque.removeFirst();
            }
            if (i >= k - 1) {
                ans[i - k + 1] = nums[deque.getFirst()];
            }
        }
        return ans;
    }
}
