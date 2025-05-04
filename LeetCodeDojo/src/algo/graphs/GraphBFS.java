package algo.graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphBFS {

    // Graph BFS
    public int fn(int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        queue.add(0 /* START_NODE */);
        seen.add(0 /* START_NODE*/);
        int ans = 0;

        while (!queue.isEmpty()) {
            int node = queue.remove();
            // do some logic
            for (int neighbor : graph[node]) {
                if (!seen.contains(neighbor)) {
                    seen.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        return ans;
    }
}
