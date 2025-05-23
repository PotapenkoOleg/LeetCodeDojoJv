package algo.stacks;

import java.util.Stack;

public class MonotonicIncreasingStack {

    // Monotonic increasing stack
    // The same logic can be applied to maintain a monotonic queue
    public int fn(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;

        for (int num: arr) {
            // for monotonic decreasing, just flip the > to <
            while (!stack.empty() && stack.peek() > num) {
                // do logic
                stack.pop();
            }

            stack.push(num);
        }

        return ans;
    }
}
