package oleg_solutions.heaps.tests;

import oleg_solutions.heaps.TopKFrequentElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void solutionTest1() {
        var nums = new int[]{1, 1, 1, 2, 2, 3};
        var k = 2;
        var actual = TopKFrequentElements.solution(nums, k);
        var expected = new int[]{1, 2};
        assertArrayEquals(expected, actual);
    }
}