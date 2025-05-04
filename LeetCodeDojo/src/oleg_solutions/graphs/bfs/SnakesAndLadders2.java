package oleg_solutions.graphs.bfs;

public class SnakesAndLadders2 {
    public int solution(int[][] board) {
        var n = board.length;
        if (n < 2) {
            return -1;
        }
        //var graph = new ArrayList<ArrayList<Integer>>();
        var direction = 0;
        for (var row = n - 1; row >= 0; row--) {
            if (direction == 0) {
                for (var col = 0; col < n; col++) {

                }
            }
            if (direction == 1) {
                for (var col = n - 1; col >= 0; col--) {

                }
            }
            direction = 1 - direction;
        }
        return -1;
    }
}
