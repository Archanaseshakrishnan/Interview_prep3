package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class goldman {
	public static void main(String args[]){
		int[] a = {1, 2, 3, 4, 5};
		System.out.println(countPairs(6,a));
	}
	 static int countPairs(int k, int[] a) {
		    ArrayList<Integer> arr = new ArrayList<Integer>();
		    //HashSet<Integer> hs = new HashSet<Integer>();
		        for(int i=0;i<a.length;i++){
		            arr.add(a[i]);
		        }
		        int count=0;
		        for(int a1 : a){
		            int target = k-a1;
		            if (arr.contains(a1) && arr.contains(target)){
		                arr.remove(a1);
		                arr.remove(target);
		                count++;
		            }
		            
		        }
		        return count;
		    }

}
