package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class IsTheSameTreeRec {
    public static boolean solution(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        var right = solution(p.left, q.right);
        var left = solution(p.left, q.left);
        return left && right;
    }
}
