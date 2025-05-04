package oleg_solutions.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

record State1(int row, int col, int steps) {
}

public class Matrix01 {
    private int m;
    private int n;
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] updateMatrix(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        Queue<State1> queue = new LinkedList<>();
        var seen = new boolean[m][n];
        for (var row = 0; row < m; row++) {
            for (var col = 0; col < n; col++) {
                if (mat[row][col] == 0) {
                    queue.offer(new State1(row, col, 1));
                    seen[row][col] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            var state = queue.poll();
            var row = state.row();
            var col = state.col();
            var steps = state.steps();
            for (var direction : directions) {
                var nextRow = row + direction[0];
                var nextCol = col + direction[1];
                if (isValid(nextRow, nextCol, mat) && !seen[nextRow][nextCol]) {
                    queue.offer(new State1(nextRow, nextCol, steps + 1));
                    seen[nextRow][nextCol] = true;
                    mat[nextRow][nextCol] = steps;
                }
            }
        }
        return mat;
    }

    private boolean isValid(int row, int col, int[][] mat) {
        return 0 <= row && row < m && 0 <= col && col < n && mat[row][col] == 1;
    }
}
