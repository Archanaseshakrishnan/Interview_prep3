package leetcode;

public class asteroid {
	public int[] asteroidCollision(int[] ast) {
        Stack<Integer> op=new Stack<Integer>();
        Stack<Integer> op2=new Stack<Integer>();
        op.push(ast[0]);
        for(int i=1;i<ast.length;i++){
            if(ast[i]<0 && op.peek()>0){
                while(!op.empty() && op.peek()>0 && ast[i]<0 && op.peek()<=java.lang.Math.abs(ast[i])){
                    int value = op.pop();
                    if(value == java.lang.Math.abs(ast[i])){
                        i++;
                        
                    }
                }
                if(op.empty() || (op.peek()<0 && ast[i]<0)){
                    if(i<ast.length)
                       op.push(ast[i]);
                }
                
            }
            else{
                op.push(ast[i]);
            }
        }
        int[] res = new int[op.size()];
        while(!op.empty()){
            op2.push(op.pop());
        }
        int j=0;
        while(!op2.empty()){
            res[j++]=op2.pop();
        }
        return res;
    }
}
