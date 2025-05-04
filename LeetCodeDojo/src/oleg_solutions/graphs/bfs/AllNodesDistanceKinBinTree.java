package oleg_solutions.graphs.bfs;

import oleg_solutions.trees.support.TreeNode;

import java.util.*;

public class AllNodesDistanceKinBinTree {
    private final Map<TreeNode, TreeNode> parents = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        dfs(root, null);
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> seen = new HashSet<>();
        queue.offer(target);
        seen.add(target);
        var distance = 0;
        while (!queue.isEmpty() && distance < k) {
            var queueSize = queue.size();
            for (var i = 0; i < queueSize; i++) {
                var node = queue.poll();
                for (var neighbor : new TreeNode[]{node.left, node.right, parents.get(node)}) {
                    if (neighbor != null && !seen.contains(neighbor)) {
                        queue.add(neighbor);
                        seen.add(neighbor);
                    }
                }
            }
            distance++;
        }
        var ans = new ArrayList<Integer>();
        queue.forEach(x -> ans.add(x.val));
        return ans;
    }

    private void dfs(TreeNode node, TreeNode parent) {
        if (node == null) {
            return;
        }
        parents.put(node, parent);
        dfs(node.left, node);
        dfs(node.right, node);
    }
}
