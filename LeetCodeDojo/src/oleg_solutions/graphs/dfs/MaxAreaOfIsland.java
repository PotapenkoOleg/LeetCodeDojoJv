package oleg_solutions.graphs.dfs;

import java.util.Stack;

public class MaxAreaOfIsland {
    private int m;
    private int n;
    private boolean[][] seen;
    private int[][] grid;
    private final int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int solution(int[][] grid) {
        int ans = 0;
        m = grid.length;
        n = grid[0].length;
        seen = new boolean[m][n];
        this.grid = grid;
        for (var row = 0; row < m; row++) {
            for (var col = 0; col < n; col++) {
                if (grid[row][col] == 1 && !seen[row][col]) {
                    seen[row][col] = true;
                    ans = Math.max(ans, dfs(row, col));
                }
            }
        }
        return ans;
    }

    private boolean isValid(int row, int col) {
        return 0 <= row && row < m && 0 <= col && col < n && grid[row][col] == 1;
    }

    //    private int dfs(int row, int col) {
//        int ans = 1;
//        for (var direction : directions) {
//            int nextRow = row + direction[0];
//            int nextCol = col + direction[1];
//            if (isValid(nextRow, nextCol) && !seen[nextRow][nextCol]) {
//                seen[nextRow][nextCol] = true;
//                ans += dfs(nextRow, nextCol);
//            }
//        }
//        return ans;
//    }
    private int dfs(int row, int col) {
        int ans = 1;
        var rowStack = new Stack<Integer>();
        var colStack = new Stack<Integer>();
        rowStack.push(row);
        colStack.push(col);
        while (!rowStack.empty()) {
            var curRow = rowStack.pop();
            var curCol = colStack.pop();
            for (var direction : directions) {
                var nextRow = curRow + direction[0];
                var nextCol = curCol + direction[1];
                if (isValid(nextRow, nextCol) && !seen[nextRow][nextCol]) {
                    seen[nextRow][nextCol] = true;
                    ans++;
                    rowStack.push(nextRow);
                    colStack.push(nextCol);
                }
            }
        }
        return ans;
    }
}
