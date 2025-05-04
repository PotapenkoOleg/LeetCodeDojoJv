package oleg_solutions.trees.bst;

import oleg_solutions.trees.support.TreeNode;

public class ValidateBST {
    public static boolean solution(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (min >= root.val || root.val >= max) {
            return false;
        }
        var left = dfs(root.left, min, root.val);
        var right = dfs(root.right, root.val, max);
        return left && right;
    }
}
