package oleg_solutions.graphs.bfs;

import java.util.LinkedList;
import java.util.Queue;

record State4(int row, int col, int steps) {
}

public class NearestExitInMaze {
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int m;
    private int n;
    private char[][] maze;

    public int soulution(char[][] maze, int[] entrance) {
        this.maze = maze;
        m = maze.length;
        n = maze[0].length;
        Queue<State4> queue = new LinkedList<>();
        var seen = new boolean[m][n];
        queue.offer(new State4(entrance[0], entrance[1], 0));
        seen[entrance[0]][entrance[1]] = true;
        while (!queue.isEmpty()) {
            var state = queue.poll();
            var row = state.row();
            var col = state.col();
            var steps = state.steps();
            for (var direction : directions) {
                var nextRow = row + direction[0];
                var nextCol = col + direction[1];
                if (isValid(nextRow, nextCol) && isExit(nextRow, nextCol) && !seen[nextRow][nextCol]) {
                    return steps + 1;
                }
                if (isValid(nextRow, nextCol) && !seen[nextRow][nextCol]) {
                    queue.offer(new State4(nextRow, nextCol, steps + 1));
                    seen[nextRow][nextCol] = true;
                }
            }
        }
        return -1;
    }

    private boolean isValid(int row, int col) {
        return 0 <= row && row < m && 0 <= col && col < n && maze[row][col] == '.';
    }

    private boolean isExit(int row, int col) {
        return (row == 0 || row == m - 1 || col == 0 || col == n - 1) && maze[row][col] == '.';
    }
}
