package oleg_solutions.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ValidParentheses {
    public static boolean solution(String s) {
        var match = Map.of('(', ')', '{', '}', '[', ']');
        Deque<Character> stack = new ArrayDeque<>();
        for (var c : s.toCharArray()) {
            if (match.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || match.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
