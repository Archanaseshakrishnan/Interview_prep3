package leetcode;

public class Max_product_subarray {
	class Solution(object):
	    def maxProduct(self, nums):
	        """
	        :type nums: List[int]
	        :rtype: int
	        """
	        if len(nums)==0:
	            return 0
	        count = 0
	        negative_index = -1
	        before = -1
	        product_now = 1
	        max_product = -99999999
	        foundzero = 0
	        for i in range(len(nums)):
	            if nums[i] > 0:
	                product_now *= nums[i]
	                if max_product < product_now:
	                        max_product = product_now
	            elif nums[i] < 0:
	                if count % 2 == 0:
	                    before = product_now
	                    negative_index = i
	                    count += 1
	                    product_now = 1
	                else:
	                    product_now *= nums[i]
	                    #if before != -1:
	                    product_now *= before
	                    product_now *= nums[negative_index]
	                    count = 0
	                    before = -1
	                    negative_index = -1
	                    if max_product < product_now:
	                        max_product = product_now
	            else:
	                if before != -1:
	                    before = -1
	                product_now = 1
	                count = 0
	                negative_index = -1        
	                foundzero = 1
	        print foundzero
	        print max_product
	        if max_product == -99999999:
	            if foundzero == 1:
	                    return 0
	            else:
	                if negative_index != -1:
	                    return nums[negative_index]
	            
	                
	        return max_product
}
