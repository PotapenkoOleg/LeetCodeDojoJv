package oleg_solutions.linkedLists;

public class ListFactory {
    public static ListNode getList(int numNodes) {
        var head = new ListNode(1);
        var dummy = head;
        for (int i = 2; i <= numNodes; i++) {
            var newNode = new ListNode(i);
            dummy.next = newNode;
            dummy = newNode;
        }
        return head;
    }
}
