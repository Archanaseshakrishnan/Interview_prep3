package leetcode;

public class Binary_substring {
	public int countBinarySubstrings(String s) {
        int thiscount=1,prevcount=0,result=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                thiscount++;
            }
            else{
                if(prevcount<=thiscount)
                result+=prevcount;
                else if(prevcount>thiscount)
                    result+=thiscount;
                prevcount=thiscount;
                thiscount=1;
            }
        }
        if(prevcount!=0 && prevcount<=thiscount)
                result+=prevcount;
                else if(prevcount>thiscount)
                    result+=thiscount;
        return result;
    }
	
}
