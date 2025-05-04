package oleg_solutions.stacks;

public class RemoveDuplicatesFromString {
    public static String solution(String s) {
        StringBuilder stack = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
