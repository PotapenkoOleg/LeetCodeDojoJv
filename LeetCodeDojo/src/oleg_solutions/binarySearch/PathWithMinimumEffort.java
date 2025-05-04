package oleg_solutions.binarySearch;

import java.util.Stack;

record Pair(int row, int col) {
}

public class PathWithMinimumEffort {
    private int n;
    private int m;
    private int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int[][] heights;

    public int minimumEffortPath(int[][] heights) {
        this.heights = heights;
        m = heights.length;
        n = heights[0].length;
        var left = 0;
        var right = 0;
        for (var i = 0; i < m; i++) {
            for (var j = 0; j < n; j++) {
                right = Math.max(right, heights[i][j]);
            }
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dfs(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean dfs(int effort) {
        var stack = new Stack<Pair>();
        var seen = new boolean[m][n];
        stack.push(new Pair(0, 0));
        seen[0][0] = true;
        while (!stack.empty()) {
            var cur = stack.pop();
            var row = cur.row();
            var col = cur.col();
            if (row == m - 1 && col == n - 1) {
                return true;
            }
            for (var direction : directions) {
                var newRow = row + direction[0];
                var newCol = col + direction[1];
                if (isValid(newRow, newCol) && !seen[newRow][newCol]) {
                    if (Math.abs(heights[newRow][newCol] - heights[row][col]) <= effort) {
                        stack.push(new Pair(newRow, newCol));
                        seen[newRow][newCol] = true;
                    }
                }
            }
        }
        return false;
    }

    private boolean isValid(int row, int col) {
        return 0 <= row && row < m && 0 <= col && col < n;
    }
}
