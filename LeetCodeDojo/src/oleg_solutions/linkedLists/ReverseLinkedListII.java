package oleg_solutions.linkedLists;

public class ReverseLinkedListII {
    public static ListNode solution(ListNode head, int left, int right) {
        if (head == null || head.next == null || left > right) {
            return head;
        }
        int position = 1;
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;
        while (position < left && cur != null && next != null) {
            prev = cur;
            cur = cur.next;
            next = next.next;
            position++;
        }
        if (next == null) {
            return head;
        }
        ListNode leftNode = prev;
        ListNode rightNode = cur;
        while (cur != null && position <= right) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            position++;
        }
        if (leftNode != null) {
            leftNode.next = prev;
        } else {
            head = prev;
        }
        rightNode.next = cur;
        return head;
    }
}
