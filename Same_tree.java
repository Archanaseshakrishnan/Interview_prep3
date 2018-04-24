package leetcode;

import java.util.ArrayList;
import java.util.List;
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class Same_tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> ppre=new ArrayList<Integer>();
        List<Integer> qpre=new ArrayList<Integer>();
        
        ppre=preorder(p,ppre);
        qpre=preorder(q,qpre);
        if(ppre.size()==qpre.size()){
            for(int i = 0;i<ppre.size();i++){
                if(ppre.get(i)!=qpre.get(i)){
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    
    List<Integer> preorder(TreeNode p, List<Integer> result){
        if(p!=null){
            if(p.left!=null || p.right!=null){
                result.add(p.val);
                result = preorder(p.left,result);
                result = preorder(p.right,result);
                return result;
            }
            else{
                result.add(p.val);
                return result;
            }
        }
        else{
            result.add(null);
            return result;
        }
    }
}
