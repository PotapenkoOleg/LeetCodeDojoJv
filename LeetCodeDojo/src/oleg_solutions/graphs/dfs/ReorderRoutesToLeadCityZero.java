package oleg_solutions.graphs.dfs;

import java.util.*;

public class ReorderRoutesToLeadCityZero {
    private final Map<Integer, List<Integer>> graph = new HashMap<>();
    private final Set<Integer> seen = new HashSet<>();
    private final Set<String> roads = new HashSet<>();

    public int minReorder(int n, int[][] connections) {
        buildUndirectedGraph(n, connections);
        seen.add(0);
        return dfs(0);
    }

    private void buildUndirectedGraph(int n, int[][] connections) {
        for (var i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (var connection : connections) {
            var source = connection[0];
            var destination = connection[1];
            graph.get(source).add(destination);
            graph.get(destination).add(source);
            roads.add(toHash(source, destination));
        }
    }

    private int dfs(int node) {
        var ans = 0;
        for (var neighbor : graph.get(node)) {
            if (!seen.contains(neighbor)) {
                if (roads.contains(toHash(node, neighbor))) {
                    ans++;
                }
                seen.add(neighbor);
                ans += dfs(neighbor);
            }
        }
        return ans;
    }

    private int dfsIter(int node) {
        var ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        while (!stack.empty()) {
            var cur = stack.pop();
            for (var neighbor : graph.get(cur)) {
                if (!seen.contains(neighbor)) {
                    if (roads.contains(toHash(cur, neighbor))) {
                        ans++;
                    }
                    seen.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
        return ans;
    }

    private String toHash(int row, int col) {
        return row + ":" + col;
    }
}
