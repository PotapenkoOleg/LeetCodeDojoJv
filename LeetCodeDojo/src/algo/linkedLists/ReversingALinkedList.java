package algo.linkedLists;

public class ReversingALinkedList {
    public class ListNode {
        public ListNode next;
    }

    // Reversing a Linked List
    public ListNode fn(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
