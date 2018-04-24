package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution_3 {
    public HashSet<List<Integer>> threeSum(int[] nums) {
    	HashSet<List<Integer>> result=new HashSet<List<Integer>>();
        List<Integer> path=new ArrayList<Integer>();
        boolean res=fun_recurse(nums,3,0,path,result,0);
        return result;
    }
    boolean fun_recurse(int[] nums, int k, int target, List<Integer> path, HashSet<List<Integer>> result,int start){
        if(k==0 && target==0){
            return true;
        }
        else if(k==0 && target!=0){
            return false;
        }
        else{
        	int i=start;
            for(i=start;i<nums.length;i++){
            	System.out.println("i: "+i);
            	path.add(nums[i]);
            	boolean res = fun_recurse(nums,k-1,target-nums[i],path,result,i+1);
                //System.out.println("k: "+k+"target: "+target)
                //System.out.println(path);
                System.out.println("Res_boolean: "+res);
                if(res==true){
                	System.out.println(path);
                    result.add(path);
                    ArrayList<Integer> path1=new ArrayList<Integer>();
                    path1.addAll(path);
                    path = new ArrayList<Integer>();
                    path.addAll(path1);
                    path.remove(path.size()-1);
                }
                else{
                	System.out.println(path);
                    //result.add(path);
                    ArrayList<Integer> path1=new ArrayList<Integer>();
                    path1.addAll(path);
                    path = new ArrayList<Integer>();
                    path.addAll(path1);
                    path.remove(path.size()-1);
                }
            }
            if(result.size()>=1){
            	return true;
            }
            else return false;
        }
    }
}
public class Three_Sum {
public static void main(String args[]){
	int[] nums={-1,0,1,2,-1,-4};
	Solution_3 sol=new Solution_3();	
	System.out.println(sol.threeSum(nums));
}
}
