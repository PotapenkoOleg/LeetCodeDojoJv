package oleg_solutions.linkedLists;

public class MiddleOfTheLinkedList {
    public static ListNode solution(ListNode head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
