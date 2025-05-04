package oleg_solutions.linkedLists;

public class RemoveDuplicatesFromSortedList {
    public static ListNode solution(ListNode head) {
        var cur = head;
        while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
