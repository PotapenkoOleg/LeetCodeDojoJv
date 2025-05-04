package oleg_solutions.hashes.tests;

import oleg_solutions.hashes.IntersectionOfMultipleArrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfMultipleArraysTest {

    @Test
    void solutionTest1() {
        int[][] input = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        var actual = IntersectionOfMultipleArrays.solution(input);
        var expected = new ArrayList<>(List.of(3, 4));
        assertEquals(expected, actual);
    }
}