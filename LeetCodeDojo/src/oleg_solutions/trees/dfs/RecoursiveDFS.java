package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

public class RecoursiveDFS {
    public static void preorderDFS(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preorderDFS(root.left);
        preorderDFS(root.right);
    }

    public static void inorderDFS(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderDFS(root.left);
        System.out.println(root.val);
        inorderDFS(root.right);
    }

    public static void postorderDFS(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        postorderDFS(root.right);
        postorderDFS(root.left);
    }
}
