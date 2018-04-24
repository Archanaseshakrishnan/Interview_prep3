package leetcode;

public class Diameter_of_a_binary_tree {
	class Solution(object):
	    max = -99999
	    def diameterOfBinaryTree(self, root):
	        """
	        :type root: TreeNode
	        :rtype: int
	        """
	        self.best = 1
	        def depth(root):
	            if not root: return 0
	            ansL = depth(root.left)
	            ansR = depth(root.right)
	            self.best = max(self.best, ansL + ansR + 1)
	            return 1 + max(ansL, ansR)

	        depth(root)
	        return self.best - 1
}
