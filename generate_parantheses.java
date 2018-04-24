package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class generate_parantheses {
	 public static List<String> generateParenthesis(int n) {
	        HashMap<Integer, List<String>> hm = new HashMap<Integer, List<String>>();
	        List<String> param = new ArrayList<String>();
	        param.add("()");
	        hm.put(2,param);
	        param = new ArrayList<String>();
	        param.add("()()");
	        param.add("(())");
	        hm.put(4, param);
	        if(n==2)
	            return hm.get(2);
	        else if(n==4){
	        	return hm.get(4);
	        }
	        else{
	            List<String> final_result = func1(2*n, hm);
	            return final_result;
	        }
	    }
	 public static List<String> func1(int n,  HashMap<Integer, List<String>> hm){        
	        if(hm.get(n)!=null)
	            return hm.get(n);
	        else{
	            StringBuilder sb=new StringBuilder();
	            List<String> returnlist=new ArrayList<String>();
	            for(int i=2;i<=n;i+=2){
	            	System.out.println(n-i);
	            	System.out.println(i);
	                List<String> result2;
	                List<String> result1;
	                if(hm.get(n-i)!=null){
	                    result1 = hm.get(n-i);
	                }
	                else{
	                    result1 = func1(n-i,hm);
	                    hm.put(n-i,result1);
	                }
	                if(hm.get(i)!=null){
	                    result2 = hm.get(i);
	                }
	                else{
	                    result2 = func1(i,hm);
	                    hm.put(i,result2);
	                }
	                for(int j=0;j<result1.size();j++){
	                    for(int k=0;k<result2.size();k++){
	                        sb.append(result1.get(j)+result2.get(k));
	                        String t = new String(sb);
	                        if(!returnlist.contains(t));
	                        returnlist.add(t);
	                        sb = new StringBuilder();
	                    }
	                }
	            }
	            List<String> temp=new ArrayList<String>();
	            func2(1,n-2,n,hm,temp);
	            if(temp.size()>0)
	            returnlist.addAll(temp);
	            return returnlist;
	        }
	    }
	   public static void func2(int start,int end,int n,HashMap<Integer, List<String>> hm,List<String> temp){
	        
	        if(start<end && (end-start+1)>=2){
	            StringBuilder sb=new StringBuilder();
	            for(int m=0;m<start;m++){
	                sb.append('(');
	            }
	            String open=new String(sb);
	            List<String> getvalue;
	            if(hm.get(end-start+1)==null){
	                getvalue=func1(end-start+1,hm);
	            }
	            else{
	                getvalue=hm.get(end-start+1);
	            }
	            StringBuilder dup=new StringBuilder();
	            for(int i=0;i<getvalue.size();i++){
	                dup.append(open+getvalue.get(i));
	                for(int j=end;j<n;j++){
	                    dup.append(')');    
	                }
	                temp.add(new String(dup));
	                dup = new StringBuilder();
	            }
	        }
	    }
	   public static void main(String args[]){
		   System.out.println(generateParenthesis(3));
	   }
}
