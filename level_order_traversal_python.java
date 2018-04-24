package leetcode;
class Solution:
    def levelOrder(self, root):
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
                
                list_temp.append(root.val)
                
                level_num[cur_level]=list_temp
            
            self.level_traverse(root.left,level_num,cur_level+1)
            self.level_traverse(root.right,level_num,cur_level+1)
public class level_order_traversal_python {

}
