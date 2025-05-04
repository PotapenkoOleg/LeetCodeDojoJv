package oleg_solutions.stacks;


import java.util.ArrayDeque;
import java.util.Stack;

public class SimplifyPath {
    public static String solution(String path) {
        var dirs = path.split("/");
        var stack = new Stack<String>();
        for (var dir : dirs) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                continue;
            }
            stack.push(dir);
        }
        var result = new StringBuilder();
        for (var dir : stack) {
            result.append("/");
            result.append(dir);
        }
        return result.isEmpty() ? "/" : result.toString();
    }
}
