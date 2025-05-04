package oleg_solutions.arrays.tests;

import oleg_solutions.arrays.WaysToSplitArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaysToSplitArrayTest {
    @Test
    void solutionTest1() {
        var actual = WaysToSplitArray.solution(
                new int[]{10, 4, -8, 7}
        );
        var expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var actual = WaysToSplitArray.solution(
                new int[]{2, 3, 1, 0}
        );
        var expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest3() {
        int[] input = new int[100_000];
        for (int i = 0; i > -100_000; i--) {
            input[Math.abs(i)] = i;
        }
        var actual = WaysToSplitArray.solution2(input);
        var expected = 70710; // 52605
        assertEquals(expected, actual);
    }
}