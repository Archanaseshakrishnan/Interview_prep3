package leetcode;

import java.util.HashMap;

class Solution {
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
        int start_index=0, max=-1;
        int i=0;
        if(s.equals(""))
            return 0;
        else if(s.length()==1)
            return 1;
        for(i=0;i<s.length();i++){
            if(hm.get(s.charAt(i))!=null){
            	System.out.println("character_repeated: "+s.charAt(i));
            	if(hm.get(s.charAt(i))+1>start_index)
                start_index=hm.get(s.charAt(i))+1;
                System.out.println("start_index: "+start_index);
            }
            hm.put(s.charAt(i),i);
            System.out.println("char added: "+s.charAt(i));
            if(i-start_index+1>max)
                    max=i-start_index+1; 
            System.out.println(max);
        }
        System.out.println(start_index);
        System.out.println(i);
        return max;
    }
}
public class lengthOfLongestSubstring {
	public static void main(String args[]){
		Solution sol=new Solution();
		System.out.println(sol.lengthOfLongestSubstring("abccbac"));
	}
}
