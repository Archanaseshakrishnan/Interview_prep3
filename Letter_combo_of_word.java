package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution_4 {
    public List<String> letterCombinations(String number) {
        List<String> str=new ArrayList<String>();
        System.out.println(number);
        
        int i=0;
        HashMap<Character,String> hs=new HashMap<Character,String>();
            hs.put('2', "abc");
            hs.put('3', "def");
            hs.put('4', "ghi");
            hs.put('5', "jkl");
            hs.put('6', "mno");
            hs.put('7', "pqrs");
            hs.put('8', "tuv");
            hs.put('9', "wxyz");
            hs.put('1', "");
        for(i=0;i<number.length();i++){
            String now=hs.get(number.charAt(i));
            System.out.println(now.length());
            if(str.size()==0){         	
                for(int j=0;j<now.length();j++){
                	System.out.println(j);
                    str.add(String.valueOf(now.charAt(j)));
                }
            }
            else{
                List<String> newstr=new ArrayList<String>();
                for(int j=0;j<now.length();j++){
                    for(int k=0;k<str.size();k++){
                        StringBuilder sb=new StringBuilder();
                        sb.append(str.get(k));
                        sb.append(now.charAt(j));
                        newstr.add(new String(sb));
                    }
                }
                str=new ArrayList<String>();
                str.addAll(newstr);
            }
        }
        return str;
    }
}
public class Letter_combo_of_word {
public static void main(String args[]){
	Solution_4 sol=new Solution_4();
System.out.println(sol.letterCombinations("2"));	
}
}
