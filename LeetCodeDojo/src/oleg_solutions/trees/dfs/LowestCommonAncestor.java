package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class LowestCommonAncestor {
    private TreeNode p;
    private TreeNode q;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.p = p;
        this.q = q;
        return solution(root);
    }

    public TreeNode solution(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (p == root || q == root) {
            return root;
        }
        var left = solution(root.left);
        var right = solution(root.right);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        } else {
            return right;
        }
    }
}
