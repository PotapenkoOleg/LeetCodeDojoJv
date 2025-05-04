package algo.trees;

public class BinaryTreeDFSRecursive {
    public class TreeNode {
        public TreeNode left;
        public TreeNode right;
    }

    // Binary tree: DFS (recursive)
    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ans = 0;
        // do logic
        dfs(root.left);
        dfs(root.right);
        return ans;
    }
}
