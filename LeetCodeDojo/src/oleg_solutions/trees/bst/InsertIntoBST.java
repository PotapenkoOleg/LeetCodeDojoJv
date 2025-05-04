package oleg_solutions.trees.bst;

import oleg_solutions.trees.support.TreeNode;

public class InsertIntoBST {
    public static TreeNode solution(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = solution(root.left, val);
        }
        if (root.val <= val) {
            root.right = solution(root.right, val);
        }
        return root;
    }
}
