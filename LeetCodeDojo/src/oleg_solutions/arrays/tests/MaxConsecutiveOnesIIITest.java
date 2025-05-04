package oleg_solutions.arrays.tests;

import oleg_solutions.arrays.MaxConsecutiveOnesIII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {
    @Test
    void solutionTest1() {
        var actual = MaxConsecutiveOnesIII.solution(
                new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2
        );
        var expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var actual = MaxConsecutiveOnesIII.solution(
                new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3
        );
        var expected = 10;
        assertEquals(expected, actual);
    }
}