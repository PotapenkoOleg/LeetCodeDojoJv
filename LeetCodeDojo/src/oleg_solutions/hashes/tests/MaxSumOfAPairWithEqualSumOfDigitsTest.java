package oleg_solutions.hashes.tests;

import oleg_solutions.hashes.MaxSumOfAPairWithEqualSumOfDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSumOfAPairWithEqualSumOfDigitsTest {

    @Test
    void solutionTest1() {
        var input = new int[]{279, 169, 463, 252, 94, 455, 423, 315, 288, 64, 494, 337, 409, 283, 283, 477, 248, 8, 89, 166, 188, 186, 128};
        var actual = MaxSumOfAPairWithEqualSumOfDigits.solution(input);
        var expected = 872;
        assertEquals(expected, actual);
    }

    @Test
    void getSumOfDigitsTest1() {
        var actual = MaxSumOfAPairWithEqualSumOfDigits.getSumOfDigits(126);
        var expected = 9;
        assertEquals(expected, actual);
    }
}