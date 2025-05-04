package oleg_solutions.linkedLists;

public class MaximumTwinSum {
    public static int solution(ListNode head) {
        if (head == null || head.next == null) {
            return (head == null) ? 0 : head.val;
        }
        var middle = middle(head);
        var reversed = reverse(middle);
        var cur = head;
        var ans = Integer.MIN_VALUE;
        while (cur != middle) {
            ans = Math.max(ans, cur.val + reversed.val);
            cur = cur.next;
            reversed = reversed.next;
        }
        return ans;
    }

    private static ListNode middle(ListNode head) {
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
