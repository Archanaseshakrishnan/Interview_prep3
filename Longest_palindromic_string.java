package leetcode;

import java.util.HashMap;

class Solution {
    public String longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int i,max=-1;
        String result="";
        if(s.length()==1)
            return s;
        for(i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))!=null){
                String newstr=s.substring(hm.get(s.charAt(i)),i+1);
                boolean check_if_pal=fun_check(newstr);
                if(check_if_pal){
                    if(max<newstr.length()){
                        result=newstr;max=newstr.length();
                    }
                }
            }
            else{
                hm.put(s.charAt(i),i);
            }
        }
        return result;
    }
    public boolean fun_check(String word){
        int len=word.length();
        int left;
        if(len%2==0){
            //even
            left=(len/2)-1;
            int right = len/2;
            while(left>=0 && right<=len-1 && word.charAt(left)==word.charAt(right)){
                left--; right++;
            }
            
        }
        else{
            int mid = len/2;
            left = mid-1;
            int right = mid+1;
            while(left>=0 && right<=len-1 && word.charAt(left)==word.charAt(right)){
                left--; right++;
            }
        }
        if(left!=-1)
                return false;
        else
            return true;
    }
}
public class Longest_palindromic_string {

}
