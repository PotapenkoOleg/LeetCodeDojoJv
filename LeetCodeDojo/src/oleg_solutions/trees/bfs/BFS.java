package oleg_solutions.trees.bfs;

import oleg_solutions.trees.support.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void printNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        var level = 1;
        while (!queue.isEmpty()) {
            System.out.println("Processing level: " + level);
            var nodesInCurrentLevel = queue.size();
            for (var i = 0; i < nodesInCurrentLevel; i++) {
                var node = queue.poll();
                System.out.println(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            level++;
        }
    }
}
