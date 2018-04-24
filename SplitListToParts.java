package leetcode;

public class SplitListToParts {
	public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode temp=root;
        int count=0;
        int index=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        if(count/k == 0){
            //lesser than k
            ListNode[] result=new ListNode[k];  
            ListNode newnode;
            ListNode head=root;
            int count2=0;
            for(int i=0;i<k;i++){
                newnode=new ListNode(head.data);
                result[index++]=newnode;
                head = head.next;
            }
        }
        else{
            //more than k
            ListNode[] result=new ListNode[(count/k)];  
            ListNode newnode=new ListNode(-1);
            newnode.data=-1;
            ListNode newhead;
            ListNode head=root;
            int remainder=count%k;
            int count2=0;
            for(int i=0;i<count;i++){
                for(int j=0;j<count/k;j++){
                    newnode.data = head.data;
                    if(newnode.data==-1){
                        newhead=new ListNode(newnode.data);
                    }
                    newnode.next=new ListNode();
                    newnode=newnode.next;
                    head=head.next;
                }
                if(count2<remainder){
                    newnode.data=head.data;
                    head=head.next;
                    count2++;
                }
                result[index++]=newhead;
                newhead=new ListNode(-1);
                newnode=new ListNode(-1);
            }         
        }
        return result;
    }
}
