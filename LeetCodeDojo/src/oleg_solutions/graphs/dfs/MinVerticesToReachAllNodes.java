package oleg_solutions.graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class MinVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] indegree = new int[n];
        for (var edge : edges) {
            indegree[edge.get(1)]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (var i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}
