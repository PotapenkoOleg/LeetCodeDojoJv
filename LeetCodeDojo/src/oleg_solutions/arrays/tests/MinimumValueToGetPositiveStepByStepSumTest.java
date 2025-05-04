package oleg_solutions.arrays.tests;

import oleg_solutions.arrays.MinimumValueToGetPositiveStepByStepSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumValueToGetPositiveStepByStepSumTest {

    @Test
    void solutionTest1() {
        var actual = MinimumValueToGetPositiveStepByStepSum.solution(
                new int[]{-3, 2, -3, 4, 2}
        );
        var expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var actual = MinimumValueToGetPositiveStepByStepSum.solution(
                new int[]{1, 2}
        );
        var expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest3() {
        var actual = MinimumValueToGetPositiveStepByStepSum.solution(
                new int[]{1, -2, -3}
        );
        var expected = 5;
        assertEquals(expected, actual);
    }
}