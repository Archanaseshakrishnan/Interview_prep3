package leetcode;

public class CountAndSay {
	public String countAndSay(int n) {
        String result,orig="1";
        
        for(int i=0;i<n-1;i++){
            result=fun(orig);
            orig=new String(result);
        }
        return orig;
    }
    public String fun(String orig){
        int count=1;
        String newstr="";
        for(int i=1;i<orig.length();i++){
            if(orig.charAt(i-1)!=orig.charAt(i)){
                newstr += (String.valueOf(count)+orig.charAt(i-1));
                count=1;
            }
            else{
                count++;
            }
        }
        newstr += String.valueOf(count)+orig.charAt(orig.length()-1);
        return newstr;
    }
}
