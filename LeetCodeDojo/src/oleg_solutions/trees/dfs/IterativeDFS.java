package oleg_solutions.trees.dfs;

import oleg_solutions.helpers.Tuple2;
import oleg_solutions.trees.support.TreeNode;

import java.util.Stack;

public class IterativeDFS {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<Tuple2<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Tuple2<>(root, 1));
        int ans = 0;

        while (!stack.empty()) {
            var pair = stack.pop();
            TreeNode node = pair.t0();
            int depth = pair.t1();

            ans = Math.max(ans, depth);
            if (node.left != null) {
                stack.push(new Tuple2<>(node.left, depth + 1));
            }
            if (node.right != null) {
                stack.push(new Tuple2<>(node.right, depth + 1));
            }
        }

        return ans;
    }
}