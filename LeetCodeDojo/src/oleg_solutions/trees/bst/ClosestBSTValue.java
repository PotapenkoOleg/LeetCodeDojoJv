package oleg_solutions.trees.bst;

import oleg_solutions.trees.support.TreeNode;

public class ClosestBSTValue {
    public static int solution(TreeNode root, double target) {
        var ans = root.val;
        while (root != null) {
            ans = Math.abs(root.val - target) < Math.abs(ans - target)
                    || (Math.abs(root.val - target) == Math.abs(ans - target) && (root.val < ans)) ? root.val : ans;
            root = (target < root.val) ? root.left : root.right;
        }
        return ans;
    }
}
