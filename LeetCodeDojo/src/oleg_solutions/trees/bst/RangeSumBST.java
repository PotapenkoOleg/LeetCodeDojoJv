package oleg_solutions.trees.bst;

import oleg_solutions.trees.support.TreeNode;

public class RangeSumBST {
    public static int solution(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        if (low <= root.val && root.val <= high) {
            ans += root.val;
        }
        if (root.val > low) {
            ans += solution(root.left, low, high);
        }
        if (root.val < high) {
            ans += solution(root.right, low, high);
        }
        return ans;
    }
}
