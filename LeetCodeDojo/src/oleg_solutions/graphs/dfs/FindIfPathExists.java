package oleg_solutions.graphs.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindIfPathExists {
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
        return dfs(source, destination);
    }

    private boolean dfs(int current, int destination) {
        if (current == destination) {
            return true;
        }
        if (!seen[current]) {
            seen[current] = true;
            for (var next : graph.get(current)) {
                if (dfs(next, destination)) {
                    return true;
                }
            }
        }
        return false;
    }
}
