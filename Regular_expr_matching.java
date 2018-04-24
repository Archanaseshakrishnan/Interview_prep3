package leetcode;

public class Regular_expr_matching {
public static boolean isMatch(String word, String expr){
	int len1=word.length();
	int len2 = expr.length(),j=0;
	if(expr.equals(".*"))
		return true;
        
	char prev = 0;
	int i=0;
	for(i=0;i<len2;i++){
		if(j<len1){
		System.out.println("start "+expr.charAt(i));
		if(expr.charAt(i)=='*'){
			while(j<len1 && word.charAt(j)==prev){
				j++;
			}
			//if(j==len1)
				
		}
		else if(expr.charAt(i)=='.'){
			if(prev != 0 && word.charAt(j)==prev){
				j++;
			}
			else if(prev==0){
				j++;
			}
			else{
				return false;
			}
		}
		else{
			if(word.charAt(j)==expr.charAt(i)){
				//System.out.println(i+"-"+j);
				prev=word.charAt(j);j++;
			}
			else{
				if(i<len2 && i+1<len2 && expr.charAt(i+1)=='*'){
					//System.out.println(expr.charAt(i));
					//System.out.println(expr.charAt(i+1));
					i+=1;					
				}
				else{
					return false;
				}
			}
		}
		}
		else{
			break;
		}
	}
	int k=0;
	for(k=i;k<len2;k++){
		if(expr.charAt(k)=='*')
		{continue;}
		else if(expr.charAt(k)!='.'){
			//letter
			if(k+1<len2 && expr.charAt(k+1)=='*'){
				k++;continue;
			}
			else{
				if(k-1>=0 && expr.charAt(k-1)=='*' && prev==expr.charAt(k))
					return true;
				else
				return false;
			}
		}
		else{
			if(prev!=0 && prev==expr.charAt(k-1)){
				continue;
			}
			else{
				return false;
			}
		}
	}
	//System.out.println(word.charAt(j));
	if(j==len1 && (i==len2 || k==len2)){
		return true;
	}
	
	
return false;
}
public static void main(String args[]){
	System.out.println(isMatch("a","ab*a"));
}
}
