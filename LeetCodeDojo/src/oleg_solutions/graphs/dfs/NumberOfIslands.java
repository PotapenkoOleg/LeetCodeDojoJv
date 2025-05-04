package oleg_solutions.graphs.dfs;

import java.util.Stack;

public class NumberOfIslands {
    private int m = 0;
    private int n = 0;
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private boolean[][] seen;

    public int numIslands(char[][] grid) {
        var ans = 0;
        m = grid.length;
        n = grid[0].length;
        seen = new boolean[m][n];
        for (var row = 0; row < m; row++) {
            for (var col = 0; col < n; col++) {
                if (grid[row][col] == '1' && !seen[row][col]) {
                    ans++;
                    seen[row][col] = true;
                    dfs(row, col, grid);
                }
            }
        }
        return ans;
    }

    private boolean isValid(int row, int col, char[][] grid) {
        return 0 <= row && row < m && 0 <= col && col < n && grid[row][col] == '1';
    }

    private void dfs(int row, int col, char[][] grid) {
        for (int[] direction : directions) {
            var nextRow = row + direction[0];
            var nextCol = col + direction[1];
            if (isValid(nextRow, nextCol, grid) && !seen[nextRow][nextCol]) {
                seen[nextRow][nextCol] = true;
                dfs(nextRow, nextCol, grid);
            }
        }
    }

    private void dfsIter(int startRow, int startCol, char[][] grid) {
        Stack<Integer> rowStack = new Stack<>();
        Stack<Integer> colStack = new Stack<>();
        rowStack.push(startRow);
        colStack.push(startCol);
        while (!rowStack.empty()) {
            var row = rowStack.pop();
            var col = colStack.pop();
            for (var direction : directions) {
                var nextRow = row + direction[0];
                var nextCol = col + direction[1];
                if (isValid(nextRow, nextCol, grid) && !seen[nextRow][nextCol]) {
                    seen[nextRow][nextCol] = true;
                    rowStack.push(nextRow);
                    colStack.push(nextCol);
                }
            }
        }
    }
}
