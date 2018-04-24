package leetcode;

import java.util.ArrayList;
import java.util.List;

public class permutation_list {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		List<Integer> list=new ArrayList<Integer>();
        fun_recurse(nums,list,result);
        return result;
    }

	public void fun_recurse(int[] nums, List<Integer> list, List<List<Integer>> result) {
		if(nums.length-list.size()==1){
			List<Integer> list1=new ArrayList<Integer>(list);
			for(int i=0;i<nums.length;i++){
				if(!list1.contains(nums[i])){
					list1.add(nums[i]);
					result.add(list1);
					list1=new ArrayList<Integer>(list);
				}
			}
		}
		else{
			List<Integer> list1=new ArrayList<Integer>(list);
			for(int i=0;i<nums.length;i++){
                if(!list1.contains(nums[i]))
				{
					list1.add(nums[i]);
					fun_recurse(nums,list1,result);
					list1=new ArrayList<Integer>(list);
				}
			}
		}
	}	
}
