package oleg_solutions.trees.dfs;

import oleg_solutions.helpers.Tuple2;
import oleg_solutions.trees.support.TreeNode;

import java.util.Stack;

public class PathSumIt {
    public static boolean solution(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        var stack = new Stack<Tuple2<TreeNode, Integer>>();
        stack.push(new Tuple2<>(root, 0));
        while (!stack.isEmpty()) {
            var tuple = stack.pop();
            var node = tuple.t0();
            var cur = tuple.t1();
            if (node.left == null && node.right == null) {
                if ((cur + node.val) == targetSum) {
                    return true;
                }
            }
            cur += node.val;
            if (node.right != null) {
                stack.push(new Tuple2<>(node.right, cur));
            }
            if (node.left != null) {
                stack.push(new Tuple2<>(node.left, cur));
            }
        }
        return false;
    }
}
