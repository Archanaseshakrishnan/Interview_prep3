package leetcode;

public class Count_of_smaller_numbers_after_self {
	class Solution(object):
	    def countSmaller(self, nums):
	        """
	        :type nums: List[int]
	        :rtype: List[int]
	        """
	        if len(nums) == 0:
	            return []
	        result = []
	        for i in range(len(nums)-1):
	            count = 0
	            for j in range(i+1,len(nums)):
	                if nums[i]>nums[j]:
	                    count+=1
	            result.append(count)
	        result.append(0)
	        return result
}
