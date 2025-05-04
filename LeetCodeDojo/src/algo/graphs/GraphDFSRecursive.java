package algo.graphs;

import java.util.HashSet;
import java.util.Set;

/**
 * For the graph templates, assume the nodes are numbered from 0 to n - 1
 * and the graph is given as an adjacency list.
 * Depending on the problem, you may need to convert the input
 * into an equivalent adjacency list before using the templates.
 */
public class GraphDFSRecursive {

    Set<Integer> seen = new HashSet<>();

    public int fn(int[][] graph) {
        seen.add(0 /* START_NODE */);
        return dfs(0 /* START_NODE */, graph);
    }

    // Graph DFS Recursive
    public int dfs(int node, int[][] graph) {
        int ans = 0;
        // do some logic
        for (int neighbor : graph[node]) {
            if (!seen.contains(neighbor)) {
                seen.add(neighbor);
                ans += dfs(neighbor, graph);
            }
        }

        return ans;
    }
}