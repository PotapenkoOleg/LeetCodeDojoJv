package oleg_solutions.heaps.tests;

import java.util.List;

import oleg_solutions.heaps.FindKClosestElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindKClosestElementsTest {
    @Test
    void solutionTest1() {
        var arr = new int[]{1, 2, 3, 4, 5};
        var k = 4;
        var x = 3;
        var actual = FindKClosestElements.solution(arr, k, x);
        var expected = List.of(1, 2, 3, 4);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}