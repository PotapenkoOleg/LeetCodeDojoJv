package oleg_solutions.heaps.tests;

import oleg_solutions.heaps.KClosestPointsToOrigin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {

    @Test
    void solutionTest1() {
        var points = new int[][]{{3, 3}, {5, -1}, {-2, 4}};
        var k = 2;
        var actual = KClosestPointsToOrigin.solution(points, k);
        var expected = new int[][]{{3, 3}, {-2, 4}};
        assertEquals(expected.length, actual.length);
    }
}