package oleg_solutions.graphs.dfs;

import java.util.*;

public class ReachableNodesWithRestrictions {
    private final Map<Integer, List<Integer>> graph = new HashMap<>();
    private boolean[] seen;
    private int ans;

    public int solution(int n, int[][] edges, int[] restricted) {
        buildGraph(edges);
        seen = new boolean[n];
        for (var node : restricted) {
            seen[node] = true;
        }
        ans = 1;
        seen[0] = true;
        dfs(0);
        return ans;
    }

    private void buildGraph(int[][] edges) {
        for (var edge : edges) {
            var x = edge[0];
            var y = edge[1];
            if (!graph.containsKey(x)) {
                graph.put(x, new ArrayList<>());
            }
            graph.get(x).add(y);
            if (!graph.containsKey(y)) {
                graph.put(y, new ArrayList<>());
            }
            graph.get(y).add(x);
        }
    }

    //    private void dfs(int node) {
//        for (var current : graph.get(node)) {
//            if (!seen[current]) {
//                seen[current] = true;
//                ans++;
//                dfs(current);
//            }
//        }
//    }
    private void dfs(int node) {
        var stack = new Stack<Integer>();
        stack.push(node);
        while (!stack.empty()) {
            int current = stack.pop();
            for (var nextNode : graph.get(current)) {
                if (!seen[nextNode]) {
                    seen[nextNode] = true;
                    ans++;
                    stack.push(nextNode);
                }
            }
        }
    }
}
