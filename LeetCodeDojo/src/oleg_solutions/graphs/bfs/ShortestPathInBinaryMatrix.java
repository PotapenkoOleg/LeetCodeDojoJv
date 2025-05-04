package oleg_solutions.graphs.bfs;


import java.util.LinkedList;
import java.util.Queue;

record State(int row, int col, int steps) {
}

public class ShortestPathInBinaryMatrix {
    private int n = 0;
    private final int[][] directions = new int[][]{{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) {
            return -1;
        }
        n = grid.length;
        var seen = new boolean[n][n];
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(0, 0, 1));
        seen[0][0] = true;
        while (!queue.isEmpty()) {
            var state = queue.poll();
            var row = state.row();
            var col = state.col();
            var steps = state.steps();
            if (row == n - 1 && col == n - 1) {
                return steps;
            }
            for (var direction : directions) {
                var nextRow = row + direction[0];
                var nextCol = col + direction[1];
                if (isValid(nextRow, nextCol, grid) && !seen[nextRow][nextCol]) {
                    seen[nextRow][nextCol] = true;
                    queue.offer(new State(nextRow, nextCol, steps + 1));
                }
            }
        }
        return -1;
    }

    private boolean isValid(int row, int col, int[][] grid) {
        return 0 <= row && row < n && 0 <= col && col < n && grid[row][col] == 0;
    }
}
