package oleg_solutions.greedy.tests;

import oleg_solutions.greedy.LeastNumOfUniqueElemAfterKDel;
import oleg_solutions.greedy.LeetCodeIPO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastNumOfUniqueElemAfterKDelTest {

    @Test
    void solution() {
        var arr = new int[]{4, 3, 1, 1, 3, 3, 2};
        var k = 3;
        var actual = LeastNumOfUniqueElemAfterKDel.solution(arr, k);
        var expected = 2;
        assertEquals(expected, actual);
    }
}