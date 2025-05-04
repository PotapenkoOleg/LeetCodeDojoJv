package oleg_solutions.graphs.bfs.tests;

import oleg_solutions.graphs.bfs.SnakesAndLadders;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakesAndLaddersTest {

    @Test
    void solutionTest1() {
        var board = new int[][]{
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 35, -1, -1, 13, -1},
                {-1, -1, -1, -1, -1, -1},
                {-1, 15, -1, -1, -1, -1}
        };
        var solution = new SnakesAndLadders();
        var actual = solution.solution(board);
        var expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var board = new int[][]{
                {-1, -1},
                {-1, 3}
        };
        var solution = new SnakesAndLadders();
        var actual = solution.solution(board);
        var expected = 1;
        assertEquals(expected, actual);
    }
}