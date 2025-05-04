package oleg_solutions.stacks;

public class BackSpaceStringCompare {
    public static String processString(String s) {
        StringBuilder stack = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }

    public static boolean solution(String s, String t) {
        return processString(s).equals(processString(t));
    }
}
