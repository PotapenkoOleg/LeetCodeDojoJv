package oleg_solutions.trees.bfs;

import oleg_solutions.trees.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public static List<Integer> solution(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            int lastNode = 0;
            for (int i = 0; i < levelLength; i++) {
                var currentNode = queue.poll();
                lastNode = currentNode.val;
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            ans.add(lastNode);
        }
        return ans;
    }
}
