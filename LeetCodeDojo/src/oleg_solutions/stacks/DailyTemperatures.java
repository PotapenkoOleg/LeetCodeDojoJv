package oleg_solutions.stacks;

import java.util.Stack;

public class DailyTemperatures {
    public static int[] solution(int[] temperatures) {
        var stack = new Stack<Integer>();
        var ans = new int[temperatures.length];
        for (var i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                var k = stack.pop();
                ans[k] = i - k;
            }
            stack.push(i);
        }
        return ans;
    }
}
