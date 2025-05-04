package oleg_solutions.linkedLists.tests;

import oleg_solutions.linkedLists.ListFactory;
import oleg_solutions.linkedLists.MiddleOfTheLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {

    @Test
    void solutionTest1() {
        var head = ListFactory.getList(5);
        var actual = MiddleOfTheLinkedList.solution(head);
        var expected = head.next.next;
        assertEquals(expected, actual);
    }

    @Test
    void solutionTest2() {
        var head = ListFactory.getList(6);
        var actual = MiddleOfTheLinkedList.solution(head);
        var expected = head.next.next.next;
        assertEquals(expected, actual);
    }
}