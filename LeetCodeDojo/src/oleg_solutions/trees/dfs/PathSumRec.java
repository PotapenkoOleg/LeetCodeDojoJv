package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class PathSumRec {
    private int targetSum;

    public boolean solution(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        return dfs(root, 0);
    }

    private boolean dfs(TreeNode root, int cur) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return (cur + root.val) == targetSum;
        }
        cur += root.val;
        var left = dfs(root.left, cur);
        var right = dfs(root.right, cur);
        return left || right;
    }
}
