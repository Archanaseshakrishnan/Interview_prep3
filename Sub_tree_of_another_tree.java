package leetcode;

public class Sub_tree_of_another_tree {
	//My soln
	class Solution(object):
	    def isSubtree(self, s, t):
	        """
	        :type s: TreeNode
	        :type t: TreeNode
	        :rtype: bool
	        """
	        if s == None and t == None:
	            return True
	        elif s != None and t == None:
	            return False
	        elif s == None and t != None:
	            return False
	        else:
	            return self.check(s,t)
	    
	    def check(self,s,t):
	        if s!= None and t!=None and s.val == t.val:
	            chk = self.check_fun(s,t)
	            if chk == True:
	                return chk
	            else:
	                return self.check(s.left,t)
	                return self.check(s.right,t)    
	        elif s!=None:
	            return self.check(s.left,t)
	            return self.check(s.right,t)
	        else:
	            return False
	    
	    def check_fun(self,s,t):
	        if s!=None and t!=None and s.val == t.val:
	            return self.check_fun(s.left,t.left) and self.check_fun(s.right,t.right)
	        elif s!=None and t!=None and s.val != t.val:
	            return False
	        elif s==None and t==None:
	            return True
	        else:
	            return False
}
//given soln
public class Solution {
	 public boolean isSubtree(TreeNode s, TreeNode t) {
	        String spreorder = generatepreorderString(s); 
	        String tpreorder = generatepreorderString(t);
	        
	        return spreorder.contains(tpreorder) ;
	    }
	    public String generatepreorderString(TreeNode s){
	        StringBuilder sb = new StringBuilder();
	        Stack<TreeNode> stacktree = new Stack();
	        stacktree.push(s);
	        while(!stacktree.isEmpty()){
	           TreeNode popelem = stacktree.pop();
	           if(popelem==null)
	              sb.append(",#"); // Appending # inorder to handle same values but not subtree cases
	           else      
	              sb.append(","+popelem.val);
	           if(popelem!=null){
	                stacktree.push(popelem.right);    
	                stacktree.push(popelem.left);  
	           }
	        }
	        return sb.toString();
	    }
	}