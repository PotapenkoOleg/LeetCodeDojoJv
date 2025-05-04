package oleg_solutions.hashes.tests;

import oleg_solutions.hashes.ContiguousArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {
    @Test
    void solutionTest1() {
        var nums = new int[]{0, 1, 0, 0, 1, 1, 0};
        var actual = ContiguousArray.solution(nums);
        var expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var nums = new int[]{0, 1};
        var actual = ContiguousArray.solution(nums);
        var expected = 2;
        assertEquals(expected, actual);
    }
}