package oleg_solutions.linkedLists.tests;

import oleg_solutions.linkedLists.ListFactory;
import oleg_solutions.linkedLists.ListNode;
import oleg_solutions.linkedLists.ReverseLinkedListII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIITest {

    @Test
    void solutionTest1() {
        var head = ListFactory.getList(5);
        var actual = ReverseLinkedListII.solution(head, 2, 4);
        var expected = 4;
        assertEquals(expected, actual.next.val);
    }

    @Test
    void solutionTest2() {
        var first = new ListNode(3);
        var second = new ListNode(5);
        first.next = second;
        var actual = ReverseLinkedListII.solution(first, 1, 1);
        var expected = 4;
        assertEquals(expected, actual.next.val);
    }
}