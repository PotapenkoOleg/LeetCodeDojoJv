package oleg_solutions.graphs.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {
    private static final int NUMBER_OF_DIE_SIDES = 6;

    public int solution(int[][] board) {
        var n = board.length;
        if (n < 2) {
            return -1;
        }
        var boardLinear = new int[n * n];
        var linearIndex = 0;
        var direction = 0;
        for (var row = n - 1; row >= 0; row--) {
            if (direction == 0) {
                for (var col = 0; col < n; col++) {
                    boardLinear[linearIndex++] = board[row][col] - 1;
                }
            }
            if (direction == 1) {
                for (var col = n - 1; col >= 0; col--) {
                    boardLinear[linearIndex++] = board[row][col] - 1;
                }
            }
            direction = 1 - direction;
        }
        var seen = new boolean[n * n];
        Queue<Integer> queue = new LinkedList<>();
        var steps = new int[n * n];
        Arrays.fill(steps, Integer.MAX_VALUE);
        queue.offer(0);
        seen[0] = true;
        steps[0] = 0;
        while (!queue.isEmpty()) {
            var current = queue.poll();
            var side = 1;
            while ((current + side < n * n) && (side <= NUMBER_OF_DIE_SIDES)) {
                var next = (boardLinear[current + side] == -2) ? current + side : boardLinear[current + side];
                if (next == n * n - 1) {
                    return steps[current] + 1;
                }
                if (!seen[next]) {
                    queue.offer(next);
                    seen[next] = true;
                    steps[next] = steps[current] + 1;
                }
                side += 1;
            }
        }
        return -1;
    }
}
