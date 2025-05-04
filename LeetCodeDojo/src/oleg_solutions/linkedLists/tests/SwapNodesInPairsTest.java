package oleg_solutions.linkedLists.tests;

import oleg_solutions.linkedLists.ListFactory;
import oleg_solutions.linkedLists.SwapNodesInPairs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {
    @Test
    void solutionTest1() {
        var head = ListFactory.getList(7);
        var expected = head.next.val;
        var actual = SwapNodesInPairs.solution(head);
        assertEquals(expected, actual.val);
    }
}