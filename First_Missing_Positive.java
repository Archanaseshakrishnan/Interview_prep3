package leetcode;

import java.util.PriorityQueue;

public class First_Missing_Positive {
public static int firstMissingPositive(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        int i=0;
        for(i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int element=pq.poll();
        //System.out.println(element);
        while(!pq.isEmpty()){
            int current=pq.poll();
            //System.out.println(current);
            if(current==element+1){
                element=current;
            }
            else{
                return element;
            }
        }
        return (element+1);
    }
public static void main(String args[]){
	int[] numbers={1,2,0};
	System.out.println(firstMissingPositive(numbers));
}
}
