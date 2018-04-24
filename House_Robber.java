package leetcode;

public class House_Robber {
	class Solution(object):
	    def rob(self, nums):
	        """
	        :type nums: List[int]
	        :rtype: int
	        """
	        return self.fun_compare(nums,0,0)
	    
	    def fun_compare(self,nums,sum1,current_index):
	        if current_index>=len(nums):
	            return sum1
	        else:
	            return max(self.fun_compare(nums,sum1+nums[current_index],current_index+2),self.fun_compare(nums,sum1,current_index+1))
}
