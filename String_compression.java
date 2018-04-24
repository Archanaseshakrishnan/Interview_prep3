package leetcode;

public class String_compression {
	public int compress(char[] chars) {
        int len=chars.length;
        StringBuilder sb=new StringBuilder();
        char cur;
        int i,count=1, prev=0, found=0;
        for(i=1;i<len;i++){
            if(chars[i]==chars[i-1]){
                prev=i-1;
            while(i<len && chars[i]==chars[i-1]){
                count++;
                i++;
            }   
                if(i==len){
                    found=1;
                }
                sb.append(chars[prev]);
                
                sb.append(count);
                count=1;
                
            }
            else{
                sb.append(chars[i-1]);
                sb.append(count);
            }
       }
        System.out.println(sb);
        System.out.println(String.valueOf(chars));
        if(found!=1){
            sb.append(chars[i-1]);
            sb.append(count);
        }
        if(chars.length>sb.length())
        {   //System.out.println("true");
            chars=new String(sb).toCharArray(); 
            return sb.length();
        }
        else{
            return chars.length;
        }
        
    }
}
