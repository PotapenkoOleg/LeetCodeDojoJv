package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class CountGoodNodesInTreeRec {
    public static int solution(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private static int dfs(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left, Math.max(max, node.val));
        int right = dfs(node.right, Math.max(max, node.val));
        var ans = left + right;
        if (node.val >= max) {
            ans++;
        }
        return ans;
    }
}
