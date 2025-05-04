package oleg_solutions.arrays.tests;

import oleg_solutions.arrays.MaximumAverageSubarrayI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    @Test
    void solutionTest1() {
        var actual = MaximumAverageSubarrayI.solution(
                new int[]{1, 12, -5, -6, 50, 3}, 4
        );
        var expected = 12.75;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var actual = MaximumAverageSubarrayI.solution(
                new int[]{5}, 1
        );
        var expected = 5.0;
        assertEquals(expected, actual);
    }
}