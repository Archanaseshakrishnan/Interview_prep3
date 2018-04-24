package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Maxlen_subarray {
	public int sublen(int[] A,int[] B,int num,int num1,HashSet<ArrayList<Integer>> pairs){
        int count=0;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        temp.add(num);
        temp.add(num1);
        if(!pairs.contains(temp)){
        while(num<A.length && num1<B.length && A[num]==B[num1]){
            ArrayList<Integer> temp1=new ArrayList<Integer>();
            temp1.add(num);
            temp1.add(num1);
            if(!pairs.contains(temp1)){
                pairs.add(temp1);
                count++;
                num++;
                num1++;
            }
            else{
                break;
            }
        }
            ArrayList<Integer> temp1=new ArrayList<Integer>();
            temp1.add(num);
            temp1.add(num1);
            pairs.add(temp1);
        }
        return count;
    }
    public int findLength(int[] A, int[] B) {
        HashMap<Integer,ArrayList<Integer>> hm1=new HashMap<Integer,ArrayList<Integer>>();
        HashMap<Integer,ArrayList<Integer>> hm2=new HashMap<Integer,ArrayList<Integer>>();
        HashSet<ArrayList<Integer>> pairs=new HashSet<ArrayList<Integer>>();
        for(int i=0;i<A.length;i++){
            if(hm1.get(A[i])!=null){
                ArrayList<Integer> indices=new ArrayList<Integer>();
                indices = hm1.get(A[i]);
                indices.add(i);
                hm1.put(A[i],indices);
            }
            else{
                ArrayList<Integer> indices=new ArrayList<Integer>();
                indices.add(i);
                hm1.put(A[i],indices);
            }
        }
        for(int i=0;i<B.length;i++){
            if(hm2.get(B[i])!=null){
                ArrayList<Integer> indices=new ArrayList<Integer>();
                indices = hm2.get(B[i]);
                indices.add(i);
                hm2.put(B[i],indices);
            }
            else{
                ArrayList<Integer> indices=new ArrayList<Integer>();
                indices.add(i);
                hm2.put(B[i],indices);
            }
        }
        int maxlen=0;
       for(int i=0;i<A.length;i++){
           ArrayList<Integer> indices=hm1.get(A[i]);
           if(hm2.get(A[i])!=null){
               for(Integer num:indices){
                   ArrayList<Integer> indices2=hm2.get(A[i]);
                   for(Integer num2:indices2){
                       int max=sublen(A,B,num,num2,pairs);
                       if(maxlen<max){
                           max=maxlen;
                       }
                   }
               }
            }
       }
       return maxlen;
    }
}
