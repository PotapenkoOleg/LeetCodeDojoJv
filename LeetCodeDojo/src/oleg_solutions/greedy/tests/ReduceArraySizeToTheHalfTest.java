package oleg_solutions.greedy.tests;

import oleg_solutions.greedy.ReduceArraySizeToTheHalf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReduceArraySizeToTheHalfTest {
    @Test
    void solutionTest1() {
        var arr = new int[]{3,3,3,3,5,5,5,2,2,7};
        ReduceArraySizeToTheHalf.minSetSize(arr);
    }
}