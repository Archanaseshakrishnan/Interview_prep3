package leetcode;

public class Sliding_Window_Maximum {
	class Solution(object):
	    def maxSlidingWindow(self, nums, k):
	        """
	        :type nums: List[int]
	        :type k: int
	        :rtype: List[int]
	        """
	        listi = []
	        if len(nums) <k:
	            return []
	        maxi = -9999999
	        for i in range(len(nums)):
	            if i+k > len(nums):
	                    break
	            for j in range(k):
	                if nums[i+j] > maxi:
	                    maxi = nums[i+j]
	            listi.append(maxi)
	            maxi = -9999999
	        return listi
}
