package oleg_solutions.trees.dfs;

import oleg_solutions.helpers.Tuple2;
import oleg_solutions.trees.support.TreeNode;

import java.util.Stack;

public class IsTheSameTreeIt {
    public static boolean solution(TreeNode p, TreeNode q) {
        var stack = new Stack<Tuple2<TreeNode, TreeNode>>();
        stack.push(new Tuple2<>(p, q));
        while (!stack.empty()) {
            var tuple = stack.pop();
            var node1 = tuple.t0();
            var node2 = tuple.t1();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null) {
                return false;
            }
            if (node1.val != node2.val) {
                return false;
            }
            stack.push(new Tuple2<>(node1.right, node2.right));
            stack.push(new Tuple2<>(node1.left, node2.left));
        }
        return true;
    }
}
