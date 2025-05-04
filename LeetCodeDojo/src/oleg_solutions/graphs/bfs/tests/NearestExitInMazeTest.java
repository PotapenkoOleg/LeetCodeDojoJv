package oleg_solutions.graphs.bfs.tests;

import oleg_solutions.graphs.bfs.NearestExitInMaze;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearestExitInMazeTest {

    @Test
    void solutionTest1() {
        var maze = new char[][]{
                {'+', '.', '+', '+', '+', '+', '+'},
                {'+', '.', '+', '.', '.', '.', '+'},
                {'+', '.', '+', '.', '+', '.', '+'},
                {'+', '.', '.', '.', '+', '.', '+'},
                {'+', '+', '+', '+', '+', '.', '+'}
        };
        var entrance = new int[]{0, 1};
        var solution = new NearestExitInMaze();
        var actual = solution.soulution(maze, entrance);
        var expected = 12;
        assertEquals(expected, actual);
    }
}