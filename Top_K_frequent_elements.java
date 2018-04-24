package leetcode;

public class Top_K_frequent_elements {
	class Solution(object):
	    def topKFrequent(self, nums, k):
	        """
	        :type nums: List[int]
	        :type k: int
	        :rtype: List[int]
	        """
	        dicti = {}
	        for i in nums:
	            if i in dicti:
	                num = dicti[i]
	                dicti[i] = num+1
	            else:
	                dicti[i] = 1
	        listi = []
	        for i in dicti:
	            if dicti[i]>=k:
	                listi.append(i)
	        return listi
}
