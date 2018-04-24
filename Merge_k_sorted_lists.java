package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class ListNode {
	 public int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	 public void display(ListNode head){
		 ListNode temp=head;
		 while(temp !=null){
			 System.out.print(temp.val+"--");
			 temp=temp.next;
		 }
	 }
}
class Solution_5 {   
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1){
            return null;
        }
        else if(lists.length==1){
            return lists[0];
        }
        else{
            int[] okay=new int[lists.length];
            int index1=0;
            for(int i=0;i<lists.length;i++){
                int len=listlength2(lists[i]);
                if(len>0){
                    okay[index1++]=i;
                }
            }
            if(okay.length>0){
        PriorityQueue<ListNode> pq= new PriorityQueue<ListNode>(okay.length,new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else 
                    return 1;
            }
        });
        ListNode[] p=new ListNode[okay.length];
        HashMap<ListNode, Integer> hm=new HashMap<ListNode, Integer>();
        ListNode s=null,newhead=null;
        for(int i=0;i<okay.length;i++){
        	p[i]=lists[okay[i]];
        	pq.add(lists[okay[i]]);
        	hm.put(lists[okay[i]], okay[i]);
        }
        int total_length=listlength(lists);
        for(int i=okay.length;i<total_length;i++){
        	if(s==null){
        		s=pq.poll();
        		newhead=s;
        	}
        	else{
        		s.next=pq.poll();
        		s=s.next;
        	}
        	int index=hm.get(s);
    		p[index]=p[index].next;
    		pq.add(p[index]);
        }
        for(int i=0;i<okay.length;i++){
        	if(s==null){
        		s=pq.poll();
        		newhead=s;
        	}
        	else{
        		s.next=pq.poll();
        		s=s.next;
        	}
        	int index=hm.get(s);
    		p[index]=p[index].next;
    		//pq.add(p[index]);
        }
		return newhead;       
    }
            return null;
        }
    }
    public int listlength(ListNode[] lists){
    	int len=0;
    	for(int i=0;i<lists.length;i++){
    		ListNode temp=lists[i];
    		while(temp!=null){
    			len++;
    			temp=temp.next;
    		}
    	}
    	return len;
    }
    public int listlength2(ListNode lists){
    	int len=0;
    	ListNode temp=lists;
    		while(temp!=null){
    			len++;
    			temp=temp.next;
    		}
    	return len;
    }
}
public class Merge_k_sorted_lists {
ListNode[] ll=new ListNode[2];
Solution_5 sol=new Solution_5();
ListNode res = sol.mergeKLists(ll);
//System.out.println(res.val);
}
