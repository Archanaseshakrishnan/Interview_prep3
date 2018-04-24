package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Degree_of_an_array {
	public static void main(String args[]){
		int[] nums={1,2,2,3,1,4,2};
		findShortestSubArray(nums);
	}
	public static int findShortestSubArray(int[] nums) {
        int num=0, maxsize=0, difference=99999;
        HashMap<Integer, ArrayList<Integer>> hm=new HashMap<Integer, ArrayList<Integer>>();
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> indexes = new ArrayList<Integer>();;
            if(hm.get(nums[i])!=null){
                // the number already exists
                indexes = hm.get(nums[i]);
                indexes.add(i);
                hm.put(nums[i],indexes);
            }
            else{
                //the number doesnot exits
                indexes.add(i);
                hm.put(nums[i],indexes);
            }
          //  System.out.println(hm);
            
            if(indexes.size()>maxsize){
                    //startsize-endsize+1 is the difference
                if(indexes.get(indexes.size()-1)!=indexes.get(0))
                {
                    difference = indexes.get(indexes.size()-1)-indexes.get(0)+1;
                    maxsize = indexes.size();
                    num = nums[i];
                }
                    
             }
            
            else if(indexes.size()==maxsize){
            	if(indexes.get(indexes.size()-1)!=indexes.get(0))
            		if(indexes.get(indexes.size()-1)-indexes.get(0)+1 <difference)
	                {
	                    difference = indexes.get(indexes.size()-1)-indexes.get(0)+1;
	                    maxsize = indexes.size();
	                    num = nums[i];
	                }
            }
        }
        if(difference==99999){
            //not changed at all
            return 1;
        }
        //System.out.println(difference);
        return difference;
    }
}
