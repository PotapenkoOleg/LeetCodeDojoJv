package oleg_solutions.graphs.bfs.tests;

import oleg_solutions.graphs.bfs.JumpGameIII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIIITest {

    @Test
    void solutionTest1() {
        var arr = new int[]{0, 1};
        var actual = JumpGameIII.canReach(arr, 1);
        var expected = true;
        assertEquals(expected, actual);
    }
}