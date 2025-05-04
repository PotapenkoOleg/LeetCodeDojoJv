package oleg_solutions.greedy.tests;

import oleg_solutions.greedy.LeetCodeIPO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeIPOTest {

    @Test
    void solutionTest1() {
        var k = 3;
        var w = 0;
        var profits = new int[]{1, 2, 3};
        var capital = new int[]{0, 1, 2};
        var actual = LeetCodeIPO.findMaximizedCapital(k, w, profits, capital);
        var expected = 6;
        assertEquals(expected, actual);
    }
}