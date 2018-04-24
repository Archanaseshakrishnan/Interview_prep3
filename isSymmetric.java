package leetcode;

public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
}

public class isSymmetric {
	public boolean isSymmetric(TreeNode root) {
	    return root==null || isSymmetricHelp(root.left, root.right);
	}

	private boolean isSymmetricHelp(TreeNode left, TreeNode right){
	    if(left==null || right==null)
	        return left==right;
	    if(left.val!=right.val)
	        return false;
	    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
}
/*my solution is wrong*/
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        else{
            StringBuilder sb=new StringBuilder();
            inorder_traversal(root,sb);
            String str=new String(sb);
            System.out.println(str);
            return isPal(str);
        }
    }
    void inorder_traversal(TreeNode root, StringBuilder sb){
        if(root!=null){
            if(root.right==null && root.left==null){
                sb.append(String.valueOf(root.val));
            }
            else{
                if(root.left!=null)
                    inorder_traversal(root.left,sb);
                else{
                   sb.append("#"); 
                }
                //if(root!=null)
                sb.append(String.valueOf(root.val));
                if(root.right!=null)
                    inorder_traversal(root.right,sb);
                else{
                   sb.append("#"); 
                }
            }
        }
    }
    boolean isPal(String str){
        int len=str.length();
        //System.out.println(len);
        if(len%2==0){
            int i=len/2;
            int j=i-1;
            while(i<len && j>=0){
                if(str.charAt(i)!=str.charAt(j))
                    return false;
                i++;j--;
            }
        }
        else{
            int i=(len/2)-1;
            int j=(len/2)+1; 
          //  System.out.println(i+"--"+j);
            while(i>=0){
            //    System.out.println(i);
            //    System.out.println(str.charAt(i)+"--"+str.charAt(j));
                if(str.charAt(i)!=str.charAt(j))
                    return false;
                i--;j++;
            }
        }
        return true;
    }
}