package leetcode;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;

public class Group_Anagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm=new HashMap<String, List<String>>();
        for(String s:strs){
            char[] s1=s.toCharArray();
            Arrays.sort(s1);
            
            if(hm.get(String.valueOf(s1))==null){
                List<String> ls=new ArrayList<String>();
                ls.add(s);
                hm.put(String.valueOf(s1),ls);
            }
            else{
                List<String> ls=hm.get(String.valueOf(s1));
                ls.add(s);
                hm.put(String.valueOf(s1),ls);
            }
        }
        List<List<String>> result=new ArrayList<List<String>>();
        Set<String> keys=hm.keySet();
        for(String k:keys){
            List<String> ls=hm.get(k);
            Collections.sort(ls);
            result.add(ls);
        }
        return result;
    }
}
