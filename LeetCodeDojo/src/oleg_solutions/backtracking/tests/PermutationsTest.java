package oleg_solutions.backtracking.tests;

import oleg_solutions.backtracking.Permutations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void solutionTest1() {
        var instance = new Permutations();
        var actual = instance.solution(new int[]{1, 2, 3});
        assertEquals(6, actual.size());
    }
}