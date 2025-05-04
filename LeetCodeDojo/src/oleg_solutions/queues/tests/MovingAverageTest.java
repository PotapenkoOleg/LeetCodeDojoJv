package oleg_solutions.queues.tests;

import oleg_solutions.queues.MovingAverage;
import oleg_solutions.stacks.SimplifyPath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingAverageTest {

    @Test
    void solutionTest1() {
        // [ 1.0, 5.5, 4.66667, 6.0]
        // [1], [10], [3], [5]
        var movingAverage = new MovingAverage(3);
        var actual = movingAverage.next(1);
        var expected = 1.0;
        assertEquals(expected, actual);
        actual = movingAverage.next(10);
        expected = 5.5;
        assertEquals(expected, actual);
        actual = movingAverage.next(3);
        expected = 4.666666666666667;
        assertEquals(expected, actual);
        actual = movingAverage.next(5);
        expected = 6.0;
        assertEquals(expected, actual);
    }
}