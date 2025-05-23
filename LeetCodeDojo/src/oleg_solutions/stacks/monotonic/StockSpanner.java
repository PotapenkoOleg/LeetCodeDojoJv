package oleg_solutions.stacks.monotonic;


import java.util.Stack;

public class StockSpanner {
    private Stack<int[]> stack = new Stack<>();

    public int next(int price) {
        int ans = 1;
        while (!stack.empty() && stack.peek()[0] <= price) {
            ans += stack.pop()[1];
        }
        stack.push(new int[]{price, ans});
        return ans;
    }
}