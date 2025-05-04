package oleg_solutions.linkedLists;

public class SwapNodesInPairs {
    public static ListNode solution(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;
        head = head.next; // saving head for return
        while (cur != null && next != null) {
            if (prev != null) {
                prev.next = next;
            }
            cur.next = next.next;
            next.next = cur;
            prev = cur;
            cur = cur.next;
            next = (cur == null) ? null : cur.next;
        }
        return head;
    }
}
