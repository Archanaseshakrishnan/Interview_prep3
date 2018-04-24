package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Find_K_closest_elements {
	
	    public List<Integer> findClosestElements(int[] arr, int k, int x) {
	        //for unsorted array
	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
	        List<Integer> res=new ArrayList<Integer>();
	        for(int i=0;i<arr.length;i++){
	            int diff = Math.abs(x-arr[i]);
	            
	            if(hm.get(diff)==null){
	                pq.add(diff);
	                ArrayList<Integer> ar=new ArrayList<Integer>();
	                ar.add(arr[i]);
	                hm.put(diff,ar);
	                
	            }
	            else{
	                ArrayList<Integer> ar=hm.get(diff);
	                ar.add(arr[i]);
	                hm.put(diff,ar);
	            }
	        }
	        
	        while(res.size()<k){
	            //System.out.println(res.size());            
	            ArrayList<Integer> ar=hm.get(pq.poll());
	            //System.out.println(ar);            
	            res.addAll(ar);
	          //  System.out.println(res);            
	        }
	        //System.out.println(res);            
	        if(res.size()>k){
	            for(int i=res.size();i>k;i--){
	                res.remove(res.size()-1);
	            }
	        }
	        Collections.sort(res);
	        return res;
	    }
	
}
