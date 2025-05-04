package oleg_solutions.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

record State2(int row, int col, int remain, int steps) {
}

public class ShortestPathWithObstacles {
    private int m;
    private int n;
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int shortestPath(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        Queue<State2> queue = new LinkedList<>();
        queue.offer(new State2(0, 0, k, 0));
        boolean[][][] seen = new boolean[m][n][k + 1];
        seen[0][0][k] = true;
        while (!queue.isEmpty()) {
            var state = queue.poll();
            var row = state.row();
            var col = state.col();
            var remain = state.remain();
            var steps = state.steps();
            if (row == m - 1 && col == n - 1) {
                return steps;
            }
            for (var direction : directions) {
                var nextRow = row + direction[0];
                var nextCol = col + direction[1];
                if (isValid(nextRow, nextCol)) {
                    if (grid[nextRow][nextCol] == 0) {
                        if (!seen[nextRow][nextCol][remain]) {
                            seen[nextRow][nextCol][remain] = true;
                            queue.offer(new State2(nextRow, nextCol, remain, steps + 1));
                        }
                    } else if (remain > 0 && !seen[nextRow][nextCol][remain - 1]) {
                        seen[nextRow][nextCol][remain - 1] = true;
                        queue.offer(new State2(nextRow, nextCol, remain - 1, steps + 1));
                    }
                }
            }
        }
        return -1;
    }

    private boolean isValid(int row, int col) {
        return 0 <= row && row < m && 0 <= col && col < n;
    }
}
