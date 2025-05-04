package oleg_solutions.stacks.tests;

import oleg_solutions.stacks.MakeStringGreat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeStringGreatTest {
    @Test
    void solutionTest1() {
        var input = "abBAcC";
        var actual = MakeStringGreat.solution(input);
        var expected = "";
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var input = "leEeetcode";
        var actual = MakeStringGreat.solution(input);
        var expected = "leetcode";
        assertEquals(expected, actual);
    }
}