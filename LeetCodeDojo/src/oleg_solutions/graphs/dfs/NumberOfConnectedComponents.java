package oleg_solutions.graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class NumberOfConnectedComponents {
    private List<Integer>[] graph;
    private boolean[] seen;

    public int solution(int n, int[][] edges) {
        int components = 0;
        graph = new List[n];
        seen = new boolean[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (var edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        for (int current = 0; current < n; current++) {
            if (!seen[current]) {
                components++;
                dfs(current);
            }
        }
        return components;
    }

    private void dfs(int current) {
        seen[current] = true;
        for (var next : graph[current]) {
            if (!seen[next]) {
                dfs(next);
            }
        }
    }
}
