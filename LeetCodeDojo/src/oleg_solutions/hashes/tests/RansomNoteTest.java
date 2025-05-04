package oleg_solutions.hashes.tests;

import oleg_solutions.hashes.RansomNote;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @Test
    void solutionTest1() {
        var input1 = "aa";
        var input2 = "aab";
        var actual = RansomNote.solution(input1, input2);
        var expected = true;
        assertEquals(expected, actual);
    }
}