package leetcode;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null && temp!=null){
            ListNode now=temp.next;
            temp.next=temp.next.next;
            now.next=temp;
            if(temp==head)
            head=now;
            
            temp=temp.next;
        }
        return temp;
    }
}
public class swap_pairs_ll {

}
