package leetcode;

public class Merge_two_binary_trees {
	# Definition for a binary tree node.
	# class TreeNode(object):
	#     def __init__(self, x):
	#         self.val = x
	#         self.left = None
	#         self.right = None

	class Solution(object):
	    def mergeTrees(self, t1, t2):
	        """
	        :type t1: TreeNode
	        :type t2: TreeNode
	        :rtype: TreeNode
	        """
	        t3 = self.rec_fun(t1,t2)
	        return t3
	    def rec_fun(self,t1,t2):
	        if t1!=None:
	            if t2!=None:
	                t3 = TreeNode(t1.val+t2.val)
	                t3.left = self.rec_fun(t1.left,t2.left)
	                t3.right = self.rec_fun(t1.right,t2.right)
	                return t3
	            else:
	                t3 = TreeNode(t1.val)
	                t3.left = self.rec_fun(t1.left,t2)
	                t3.right = self.rec_fun(t1.right,t2)
	                return t3
	        else:
	            if t2!=None:
	                t3 = TreeNode(t2.val)
	                t3.left = self.rec_fun(t1,t2.left)
	                t3.right = self.rec_fun(t1,t2.right)
	                return t3
	            else:
	                return None
}
