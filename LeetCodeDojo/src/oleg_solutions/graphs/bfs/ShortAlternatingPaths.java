package oleg_solutions.graphs.bfs;

import java.util.*;

record State3(int node, int color, int steps) {
}

public class ShortAlternatingPaths {
    private static final int RED = 0;
    private static final int BLUE = 1;
    private final Map<Integer, Map<Integer, List<Integer>>> graph = new HashMap<>();

    public int[] solution(int n, int[][] redEdges, int[][] blueEdges) {
        buildGraph(RED, redEdges, n);
        buildGraph(BLUE, blueEdges, n);
        var ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        Queue<State3> queue = new LinkedList<>();
        queue.offer(new State3(0, RED, 0));
        queue.offer(new State3(0, BLUE, 0));
        var seen = new boolean[n][2];
        seen[0][RED] = true;
        seen[0][BLUE] = true;
        while (!queue.isEmpty()) {
            var state = queue.poll();
            var node = state.node();
            var color = state.color();
            var steps = state.steps();
            ans[node] = Math.min(ans[node], steps);
            for (var neighbor : graph.get(color).get(node)) {
                if (!seen[neighbor][1 - color]) {
                    seen[neighbor][1 - color] = true;
                    queue.offer(new State3(neighbor, 1 - color, steps + 1));
                }
            }
        }
        for (var i = 0; i < n; i++) {
            if (ans[i] == Integer.MAX_VALUE) {
                ans[i] = -1;
            }
        }
        return ans;
    }

    private void buildGraph(int color, int[][] edges, int n) {
        graph.put(color, new HashMap<>());
        var subGraph = graph.get(color);
        for (var i = 0; i < n; i++) {
            subGraph.put(i, new ArrayList<>());
        }
        for (var edge : edges) {
            var src = edge[0];
            var dest = edge[1];
            subGraph.get(src).add(dest);
        }
    }
}
