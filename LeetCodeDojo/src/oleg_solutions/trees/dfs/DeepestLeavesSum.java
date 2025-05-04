package oleg_solutions.trees.dfs;

import oleg_solutions.trees.support.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    private int maxLevel = Integer.MIN_VALUE;
    private int sum = 0;

    public int solution(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    public void dfs(TreeNode root, int level) {
        if (root.left == null && root.right == null) {
            if (level > maxLevel) {
                maxLevel = level;
                sum = 0;
            }
            if (level == maxLevel) {
                sum += root.val;
            }
            return;
        }
        if (root.left != null) {
            dfs(root.left, level + 1);
        }
        if (root.right != null) {
            dfs(root.right, level + 1);
        }
    }
}
