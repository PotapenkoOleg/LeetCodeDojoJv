package oleg_solutions.trees.bfs;

import oleg_solutions.trees.support.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            var levelSize = queue.size();
            ans = 0;
            for (var i = 0; i < levelSize; i++) {
                var curNode = queue.poll();
                ans += curNode.val;
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
        }
        return ans;
    }
}
