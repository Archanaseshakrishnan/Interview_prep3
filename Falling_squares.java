package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Falling_squares {
	public static void main(String args[]){
		
	}
	public static List<Integer> fallingSquares(int[][] positions) {
		int max=-1;
        List<Integer> li = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<positions.length;i++){
            int start=positions[i][0];
            int end=start+positions[i][1];
            int ht=positions[i][1];
           // System.out.println(hm.get(start));
           // System.out.println(hm.get(start+1));
            for(int j=start;j<end;j++){
                if(hm.get(j)!=null){
                    ht+=hm.get(j);
                    break;
                }
            }
            /*if(end-start==1){
                if(hm.get(end)!=null){
                    ht+=hm.get(end);
                }
            }*/
           /* if(hm.get(start)!=null && hm.get(start+1) != null ){
                ht+=hm.get(start);
            }*/
            for(int j=start;j<end;j++)
            { 
                hm.put(j,ht);
                
            }
            
            if(max<ht){
                max=ht;
            }
            li.add(max);
        }
        return li;
    }
}
