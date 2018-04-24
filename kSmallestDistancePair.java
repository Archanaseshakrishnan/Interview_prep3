package leetcode;

import java.util.PriorityQueue;

public class kSmallestDistancePair {
	public int smallestDistancePair(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length*nums.length);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                
                pq.add(Math.abs(nums[i]-nums[j]));
            }
        }
        for(int i=0;i<k-1;i++)
            pq.poll();
        return pq.peek();
    }
}
