package oleg_solutions.graphs.dfs;

import java.util.*;

public class NumberOfProvinces {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private Set<Integer> seen = new HashSet<>();

    public int findCircleNum(int[][] isConnected) {
        buildGraph(isConnected);
        var ans = 0;
        for (var i = 0; i < isConnected.length; i++) {
            if (!seen.contains(i)) {
                ans++;
                seen.add(i);
                dfs(i);
            }
        }
        return ans;
    }

    private void buildGraph(int[][] isConnected) {
        var n = isConnected.length;
        for (var i = 0; i < n; i++) {
            if (!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
            for (var j = i + 1; j < n; j++) {
                if (!graph.containsKey(j)) {
                    graph.put(j, new ArrayList<>());
                }
                if (isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
    }

    private void dfs(int node) {
        for (var neighbor : graph.get(node)) {
            if (!seen.contains(neighbor)) {
                seen.add(neighbor);
                dfs(neighbor);
            }
        }
    }

    private void dfsIterative(int node) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        while (!stack.empty()) {
            var current = stack.pop();
            for (var neighbor : graph.get(current)) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }
}


