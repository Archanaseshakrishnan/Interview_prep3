package leetcode;
class Solution:
    indexpre=0
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: TreeNode
        """
        Solution.indexpre=0
        tree = self.fun_build(0,len(preorder)-1,preorder,inorder)
        return tree
    
    def fun_build(self, start, end, preorder,inorder):
        if Solution.indexpre < len(preorder):
            rootval = preorder[Solution.indexpre]
            print (Solution.indexpre)
            print("Rootval: ",rootval)
            root = TreeNode(rootval)
            print(end-start+1)
            if end-start+1 > 1:
                print ("Rootval: >3")
                i = inorder.index(rootval)
                Solution.indexpre+=1
                root.left = self.fun_build(start,i-1,preorder,inorder)
                root.right = self.fun_build(i+1,end,preorder,inorder)
                return root
            else:
                
                print("Rootval: <=3")
                if end-start >= 0:
                    i = inorder.index(rootval)                    
                    if start==end:                        
                        Solution.indexpre+=1
                        return root
                    else:
                        return None
                else:
                    return None
        else:
            return None    