package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class MaxDifBetweenNodeAndAncestor {
    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, root.val, root.val);
    }

    private static int dfs(TreeNode root, int max, int min) {
        if (root == null) {
            return max - min;
        }
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        var left = dfs(root.left, max, min);
        var right = dfs(root.right, max, min);
        return Math.max(left, right);
    }
}
