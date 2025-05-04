package oleg_solutions.hashes.tests;

import oleg_solutions.hashes.CheckIfAllOccurrencesAreEqual;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfAllOccurrencesAreEqualTest {

    @Test
    void solutionTest1() {
        var actual = CheckIfAllOccurrencesAreEqual.solution("abacbc");
        var expected = true;
        assertEquals(expected, actual);
    }
}