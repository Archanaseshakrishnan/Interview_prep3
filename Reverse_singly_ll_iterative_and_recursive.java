package leetcode;
class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}
public class Reverse_singly_ll_iterative_and_recursive {
	public ListNode reverseList1(ListNode head) {
	    /* iterative solution */
	    ListNode newHead = null;
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = newHead;
	        newHead = head;
	        head = next;
	    }
	    return newHead;
	}

	public ListNode reverseList(ListNode head) {
	    /* recursive solution */
	    return reverseListInt(head, null);
	}

	private ListNode reverseListInt(ListNode head, ListNode newHead) {
	    if (head == null)
	        return newHead;
	    ListNode next = head.next;
	    head.next = newHead;
	    return reverseListInt(next, head);
	}
}
