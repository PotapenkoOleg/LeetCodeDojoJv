package oleg_solutions.trees.bfs;

import oleg_solutions.trees.support.TreeNode;

import java.util.*;

public class ZigZagLevelOrderTraversal {
    private static final List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> solution(TreeNode root) {
        if (root == null) {
            return ans;
        }
        dfs(root);
        return ans;
    }

    private static void dfs(TreeNode root) {
        var levelNumber = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var curLevel = new ArrayList<Integer>();
            var it = (levelNumber % 2 == 1) ? queue.descendingIterator() : queue.iterator();
            while (it.hasNext()) {
                curLevel.add(it.next().val);
            }
            ans.add(curLevel);
            var levelSize = queue.size();
            for (var i = 0; i < levelSize; i++) {
                var node = queue.removeFirst();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            levelNumber++;
        }
    }
}
