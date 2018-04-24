package leetcode;
# Definition for binary tree with next pointer.
# class TreeLinkNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#         self.next = None

class Solution:
    # @param root, a tree link node
    # @return nothing
    def connect(self, root):
        level_num=[]
        self.level_traverse(root,level_num,0)
        for i in range(len(level_num)):
            list1 = level_num[i]
            for j in range(len(list1)):
                if j+1 < len(list1):
                    list1[j].next = list1[j+1]
                else:
                    list1[j].next = None
        
    def level_traverse(self,root,level_num,cur_level):
        if root != None:
            
            if cur_level+1 > len(level_num) or cur_level == 0:
                
                list_temp = []
                list_temp.append(root)
                level_num.insert(cur_level,list_temp)
            else:
                list_temp = level_num[cur_level]
                
                list_temp.append(root)
                
                level_num[cur_level]=list_temp
            
            self.level_traverse(root.left,level_num,cur_level+1)
            self.level_traverse(root.right,level_num,cur_level+1)
public class Populating_next_pointers {

}
