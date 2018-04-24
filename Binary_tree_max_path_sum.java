package leetcode;

public class Binary_tree_max_path_sum {

}
class Solution(object):
    totalmax = -99999999
    def maxPathSum(self, root):
        """
        :type root: TreeNode
        :rtype: int
        #main point to note there is always a straight path between root to node"""
        sum_this_node = {}
        self.traverse(root, sum_this_node)
        if self.totalmax == -99999999:
            return 0
        else:
            return self.totalmax
    
    def traverse(self, root, sum_this_node):
        if(root != None):
            sum = 0
            sum_from_left = self.traverse(root.left, sum_this_node)
            if sum_from_left >= 0:
                sum += sum_from_left
            sum_from_right = self.traverse(root.right, sum_this_node)
            if sum_from_right >= 0:
                sum += sum_from_right
            sum_this_node[root] = sum + root.val
            if self.totalmax < sum_this_node[root]:
                self.totalmax = sum_this_node[root]
            return sum_this_node[root]
        else:
            return 0