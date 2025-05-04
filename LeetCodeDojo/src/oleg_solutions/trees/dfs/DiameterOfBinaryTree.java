package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class DiameterOfBinaryTree {
    private static int ans;

    public static int solution(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        var left = dfs(root.left);
        var right = dfs(root.right);
        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;
    }
}
