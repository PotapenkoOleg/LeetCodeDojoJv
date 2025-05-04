package oleg_solutions.linkedLists.tests;

import oleg_solutions.linkedLists.ListFactory;
import oleg_solutions.linkedLists.ReverseLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    @Test
    void solutionTest1() {
        var head = ListFactory.getList(5);
        var actual = ReverseLinkedList.solution(head);
        var expected = 5;
        assertEquals(expected, actual.val);
    }

    @Test
    void solutionTest2() {
        var head = ListFactory.getList(2);
        var actual = ReverseLinkedList.solution(head);
        var expected = 5;
        assertEquals(expected, actual.val);
    }
}