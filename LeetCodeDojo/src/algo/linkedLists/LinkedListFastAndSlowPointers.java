package algo.linkedLists;

public class LinkedListFastAndSlowPointers {
    public class ListNode {
        public ListNode next;
    }

    // Linked List: Fast and Slow Pointers
    public int fn(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int ans = 0;

        while (fast != null && fast.next != null) {
            // do logic
            slow = slow.next;
            fast = fast.next.next;
        }

        return ans;
    }
}
