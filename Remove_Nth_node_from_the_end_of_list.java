package leetcode;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastpointer=head;
        ListNode slowpointer=head;
        for(int i=0;i<n;i++){
            fastpointer=fastpointer.next;
        }
        while(fastpointer.next!=null){
            fastpointer = fastpointer.next;
            slowpointer = slowpointer.next;
        }
        return slowpointer;
    }
}
public class Remove_Nth_node_from_the_end_of_list {
public static void main(String args[]){
	
}
}
