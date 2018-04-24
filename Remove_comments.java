package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Remove_comments {
	static int comment2=0;
		public static void main(String args[]){
			String[] s={"main() { ", "  int a = 1; /* Its comments here ", "", "  ", "  */ return 0;", "} "};
			System.out.println(removeComments(s));
		}
	  public static List<String> removeComments(String[] s) {
	        List<String> res=new ArrayList<String>();
	        String prev="";
	        for(int i=0;i<s.length;i++){
	        	String word=trim(s[i]);
	        	if(word.contains("{") || word.contains("{") || word.contains(";") || word.contains("()") || word.contains(" ")){
	        		if(!word.equals(""))
	    	        	res.add(prev+=word);
	        		//System.out.println(prev);
	        			prev="";
	        	}
	        	else{
	        		prev+=word;
	        		//System.out.println(prev);
	        	}
	        }
	        if(!prev.equals(""))
	        	res.add(prev);
	        return res;
	    }
	    public static String trim(String word){
	        String result;
	        int comment1=0;
	        StringBuilder r2=new StringBuilder();
	        for(int i=0;i<word.length();i++){
	            if(word.charAt(i)=='/'){
	                if(i+1<word.length()){
	                if(word.charAt(i+1)=='/'){
	                    comment1=1;
	                    
	                    
	                }
	                else if(word.charAt(i+1)=='*'){
	                    comment2=1;i++;
	                }
	                else{
	                    if(comment1==0 && comment2==0)
	                    r2.append(word.charAt(i));
	                }
	                }
	            }
	            else if(word.charAt(i)=='*'){
	            	 if(i+1<word.length()){
	                if(word.charAt(i+1)=='/'){
	                    if(comment2==1){
	                        comment2=0;
	                        i++;
	                    }
	                    else{
	                        if(comment1==0 && comment2==0)
	                        r2.append(word.charAt(i));
	                    }
	                }
	                else{
	                    if(comment1==0 && comment2==0)
	                    r2.append(word.charAt(i));
	                }
	            	 }
	            }
	        else{
	                if(comment1==0 && comment2==0)
	                    r2.append(word.charAt(i));
	            }
	            }
	        result=new String(r2);
	        return result;
	    }
}
