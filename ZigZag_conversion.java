package leetcode;

import java.util.HashMap;

class Solution_1 {
    public String convert(String s, int nRows) {
        int i=0,index=0;
        char[][] res_words=new char[nRows][s.length()];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<nRows;j++){
            hm.put(j,0);
        }
        if(s.length()<=nRows)
            return s;
        while(index<s.length()){
           if(i%2==0){
                for(int j=0;j<nRows;j++){
                    if(index<s.length()){
                        int this_index=hm.get(j);
                        res_words[j][this_index++]=s.charAt(index++);
                        hm.put(j,this_index);
                    }
                    else
                        break;
                }
            }
            else{
                for(int j=0;j<nRows;j++){
                    if(index<s.length()){
                        int this_index=hm.get(j);
                        res_words[j][this_index++]=s.charAt(index++);
                        hm.put(j,this_index);
                    }
                    else
                        break;
                }
            }
         i++;   
        }
        for(i=0;i<res_words.length;i++)
            for(int j=0;j<res_words[i].length;j++)
                sb.append(res_words[i][j]);
        return (new String(sb));
    }
}
public class ZigZag_conversion {
public static void main(String args[]){
	Solution_1 sol=new Solution_1();
	System.out.println(sol.convert("PAYPALISHIRING", 3));
}
}
