package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class MinDepthOfBinaryTreeRec {
    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return solution(root.right) + 1;
        }
        if (root.right == null) {
            return solution(root.left) + 1;
        }
        var left = solution(root.left);
        var right = solution(root.right);
        return Math.min(left, right) + 1;
    }
}
