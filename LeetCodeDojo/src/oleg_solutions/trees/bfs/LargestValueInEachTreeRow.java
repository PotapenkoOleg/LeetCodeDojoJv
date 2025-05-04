package oleg_solutions.trees.bfs;

import oleg_solutions.trees.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInEachTreeRow {
    public static List<Integer> solution(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            var levelLength = queue.size();
            var max = Integer.MIN_VALUE;
            for (int i = 0; i < levelLength; i++) {
                var curNode = queue.poll();
                max = Math.max(max, curNode.val);
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer(curNode.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}
