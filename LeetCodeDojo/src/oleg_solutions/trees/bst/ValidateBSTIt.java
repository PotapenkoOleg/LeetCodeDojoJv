package oleg_solutions.trees.bst;

import oleg_solutions.trees.support.TreeNode;

import java.util.Stack;

record State(TreeNode node, long min, long max) {
}

public class ValidateBSTIt {
    public static boolean solution(TreeNode root) {
        Stack<State> stack = new Stack<>();
        stack.push(new State(root, Long.MIN_VALUE, Long.MAX_VALUE));
        while (!stack.empty()) {
            var state = stack.pop();
            var node = state.node();
            var min = state.min();
            var max = state.max();
            if (min >= node.val || node.val >= max) {
                return false;
            }
            if (node.left != null) {
                stack.push(new State(node.left, min, node.val));
            }
            if (node.right != null) {
                stack.push(new State(node.right, node.val, max));
            }
        }
        return true;
    }
}
