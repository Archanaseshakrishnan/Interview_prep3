package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Partition_to_k_equal_sum_subsets {
public static void main(String args[]){
	//int[] nums={4, 3, 2, 3, 5, 2, 1};
	int[] nums={1, 2, 3, 4, 5};
	System.out.println(canPartitionKSubsets(nums,3));
}
public static boolean canPartitionKSubsets(int[] nums, int k) {
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	ArrayList<ArrayList<Integer>> array = generate_subset(nums,0);
	//System.out.println(array.size());
	int total=0;
	for(ArrayList<Integer> sum:array){
		for(Integer i:sum){
			System.out.print(i+" ");
			total+=i;
		}
		System.out.println();
		if(hm.get(total)!=null){
			int size = hm.get(total)+1;
			hm.put(total, size);
		}
		else{
		hm.put(total,1);
		}
		total=0;
	}
	if(hm.containsValue(k))
	{   
		System.out.println(hm);
		return true;
	}
		return false;
}
public static ArrayList<ArrayList<Integer>> generate_subset(int[] nums, int start){
	ArrayList<ArrayList<Integer>> subsets=new ArrayList<ArrayList<Integer>>();
	if(start+1 == nums.length){
		ArrayList<Integer> sum = new ArrayList<Integer>();
		sum.add(nums[start]);
		subsets.add(sum);
	}
	else{
		ArrayList<ArrayList<Integer>> returnedlist=new ArrayList<ArrayList<Integer>>();
		returnedlist = generate_subset(nums,start+1);
		subsets.addAll(returnedlist);
		//System.out.println("look here:");
		//System.out.println(subsets);
		for(ArrayList<Integer> data:returnedlist){
			//System.out.println(sum);
			ArrayList<Integer> sum = new ArrayList<Integer>(data);
			sum.add(nums[start]);
			
			subsets.add(sum);
			//System.out.println("changed");
			//System.out.println(subsets);
		}
		ArrayList<Integer> thisnum = new ArrayList<Integer>();
		thisnum.add(nums[start]);
		subsets.add(thisnum);
	}
	//System.out.println(subsets);
	if(start==0){
		ArrayList<Integer> sum = new ArrayList<Integer>();
		subsets.add(sum);
	}
	
	return subsets;
}
public boolean canPartitionKSubsets(int[] nums, int k) {
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int cursum=0;
    helper(nums,0,cursum,hm);
    System.out.println(hm);
    if(hm.containsValue(k))
        return true;
    else{
        for (Integer i : hm.values()){
            if(i>k){
                return true;
            }
        }
    }
        return false;
}
public void helper(int[] nums,int start,int cursum,HashMap<Integer,Integer> hm){
    if(start<nums.length){
    if(hm.get(nums[start]+cursum)==null){
        hm.put(nums[start]+cursum,1);
    }
    else{
        int temp=hm.get(nums[start]+cursum)+1;
        hm.put(nums[start]+cursum,temp);            
    }
        helper(nums,start+1,nums[start]+cursum,hm);
        helper(nums,start+1,cursum,hm);
    }
}
}
