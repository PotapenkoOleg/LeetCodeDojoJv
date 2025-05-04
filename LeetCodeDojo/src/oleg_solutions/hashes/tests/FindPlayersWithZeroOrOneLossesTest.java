package oleg_solutions.hashes.tests;

import oleg_solutions.hashes.FindPlayersWithZeroOrOneLosses;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPlayersWithZeroOrOneLossesTest {

    @Test
    void solutionTest1() {
        int[][] input = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        var actual = FindPlayersWithZeroOrOneLosses.solution(input);
        var expected = new int[][]{{1, 2, 10}, {4, 5, 7, 8}};
        assertEquals(expected, actual);
    }
}