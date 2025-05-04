package oleg_solutions.hashes.tests;

import oleg_solutions.hashes.FirstLetterToAppearTwice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLetterToAppearTwiceTest {

    @Test
    void solutionTest1() {
        var actual = FirstLetterToAppearTwice.solution("abccbaacz");
        var expected = 'c';
        assertEquals(expected, actual);
    }
}