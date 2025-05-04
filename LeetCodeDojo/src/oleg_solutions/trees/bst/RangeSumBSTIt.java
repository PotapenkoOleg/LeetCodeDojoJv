package oleg_solutions.trees.bst;

import oleg_solutions.trees.support.TreeNode;

import java.util.Stack;

public class RangeSumBSTIt {
    public static int solution(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        var ans = 0;
        while (!stack.empty()) {
            var node = stack.pop();
            if (low <= node.val && node.val <= high) {
                ans += node.val;
            }
            if (node.left != null && node.val > low) {
                stack.push(node.left);
            }
            if (node.right != null && node.val < high) {
                stack.push(node.right);
            }
        }
        return ans;
    }
}
