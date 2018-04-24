package leetcode;
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def zigzagLevelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        level_num = []
        cur_level = 0
        self.level_traverse(root, level_num, cur_level)    
        return level_num
    
    def level_traverse(self,root,level_num,cur_level):
        if root != None:            
            if cur_level+1 > len(level_num) or cur_level == 0:                
                list_temp = []
                list_temp.append(root.val)
                level_num.insert(cur_level,list_temp)    
            else:
                list_temp = level_num[cur_level]
                if cur_level%2==0:
                    list_temp.append(root.val)
                else:
                    list_temp.insert(0,root.val)
                level_num[cur_level]=list_temp
            self.level_traverse(root.left,level_num,cur_level+1)
            self.level_traverse(root.right,level_num,cur_level+1)
        
public class Binary_zig_zag {

}
