package oleg_solutions.linkedLists.tests;

import oleg_solutions.linkedLists.ListFactory;
import oleg_solutions.linkedLists.MaximumTwinSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTwinSumTest {

    @Test
    void solutionTest1() {
        var head = ListFactory.getList(6);
        var actual = MaximumTwinSum.solution(head);
        var expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var head = ListFactory.getList(2);
        var actual = MaximumTwinSum.solution(head);
        var expected = 3;
        assertEquals(expected, actual);
    }
}