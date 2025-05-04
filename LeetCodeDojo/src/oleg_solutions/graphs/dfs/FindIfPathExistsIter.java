package oleg_solutions.graphs.dfs;

import java.util.*;

public class FindIfPathExistsIter {
    private final Map<Integer, List<Integer>> graph = new HashMap<>();
    private boolean[] seen;

    public boolean solution(int n, int[][] edges, int source, int destination) {
        seen = new boolean[n];
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
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        seen[source] = true;
        while (!stack.empty()) {
            var current = stack.pop();
            if (current == destination) {
                return true;
            }
            for (var next : graph.get(current)) {
                if (!seen[next]) {
                    stack.push(next);
                    seen[next] = true;
                }
            }
        }
        return false;
    }
}
