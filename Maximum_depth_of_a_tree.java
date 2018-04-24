package leetcode;
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    max_len = 0
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.level_order_traversal(root,1)
        return self.max_len
    
    def level_order_traversal(self, root, cur_level):
        if root != None:
            if root.left == None and root.right == None:
                if self.max_len < cur_level:
                    self.max_len = cur_level
            self.level_order_traversal(root.left,cur_level+1)
            self.level_order_traversal(root.right,cur_level+1)
            
public class Maximum_depth_of_a_tree {

}
