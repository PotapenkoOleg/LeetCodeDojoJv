package oleg_solutions.graphs.bfs;

import java.util.*;

public class DetonateMaxBombs {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private int n;

    public int maximumDetonation(int[][] bombs) {
        n = bombs.length;
        buildGraph(bombs);
        int ans = Integer.MIN_VALUE;
        for (var i = 0; i < n; i++) {
            ans = Math.max(ans, bfs(i));
        }
        return ans;
    }

    private void buildGraph(int[][] bombs) {
        for (var i = 0; i < n; i++) {
            if (!graph.containsKey(i)) {
                graph.put(i, new ArrayList<>());
            }
        }
        for (var i = 0; i < n - 1; i++) {
            for (var j = i + 1; j < n; j++) {
                var xi = bombs[i][0];
                var yi = bombs[i][1];
                var ri = bombs[i][2];
                var xj = bombs[j][0];
                var yj = bombs[j][1];
                var rj = bombs[j][2];
                if ((long) rj * rj >= (long) (xj - xi) * (xj - xi) + (long) (yj - yi) * (yj - yi)) {
                    graph.get(j).add(i);
                }
                if ((long) ri * ri >= (long) (xi - xj) * (xi - xj) + (long) (yi - yj) * (yi - yj)) {
                    graph.get(i).add(j);
                }
            }
        }
    }

    private int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> seen = new HashSet<>();
        queue.offer(start);
        seen.add(start);
        while (!queue.isEmpty()) {
            var cur = queue.poll();
            for (var next : graph.get(cur)) {
                if (!seen.contains(next)) {
                    queue.offer(next);
                    seen.add(next);
                }
            }
        }
        return seen.size();
    }
}
