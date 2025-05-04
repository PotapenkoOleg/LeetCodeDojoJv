package oleg_solutions.trees.bst;

import oleg_solutions.trees.support.TreeNode;

public class MinimumAbsoluteDifference {
    private int minDiff = Integer.MAX_VALUE;
    private TreeNode prev = null;

    public int solution(TreeNode root) {
        dfs(root);
        return minDiff;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;
        dfs(root.right);
    }
}
