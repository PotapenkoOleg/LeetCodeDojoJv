package oleg_solutions.stacks;

public class MakeStringGreat {
    public static String solution(String s) {
        var stack = new StringBuilder();
        for (var c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                var prevChar = stack.charAt(stack.length() - 1);
                if ((Character.isLowerCase(prevChar) && (Character.toUpperCase(prevChar) == c))
                        || (Character.isLowerCase(c) && (prevChar == Character.toUpperCase(c)))) {
                    stack.deleteCharAt(stack.length() - 1);
                    continue;
                }
            }
            stack.append(c);
        }
        return stack.toString();
    }
}
