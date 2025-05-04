package oleg_solutions.stacks.tests;

import oleg_solutions.stacks.SlidingWindowMaximum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowMaximumTest {

    @Test
    void solutionTest1() {
        var input = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        var k = 3;
        var actual = SlidingWindowMaximum.solution(input, k);
        var expected = new int[]{3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, actual);
    }
}