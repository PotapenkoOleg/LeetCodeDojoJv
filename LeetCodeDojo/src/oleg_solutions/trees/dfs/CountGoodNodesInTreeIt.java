package oleg_solutions.trees.dfs;

import oleg_solutions.helpers.Tuple2;
import oleg_solutions.trees.support.TreeNode;

import java.util.Stack;

public class CountGoodNodesInTreeIt {
    public static int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        var stack = new Stack<Tuple2<TreeNode, Integer>>();
        stack.push(new Tuple2<>(root, Integer.MIN_VALUE));
        var ans = 0;
        while (!stack.empty()) {
            var tuple = stack.pop();
            var node = tuple.t0();
            var max = tuple.t1();
            if (node.val >= max) {
                ans++;
            }
            if (node.right != null) {
                stack.push(new Tuple2<>(node.right, Math.max(max, node.val)));
            }
            if (node.left != null) {
                stack.push(new Tuple2<>(node.left, Math.max(max, node.val)));
            }
        }
        return ans;
    }
}
