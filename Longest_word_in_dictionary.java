package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Longest_word_in_dictionary {
	public String longestWord(String[] words) {
        int max=Integer.MIN_VALUE;
        ArrayList<String> final_set=new ArrayList<String>();
        ArrayList<String> starters=new ArrayList<String>();
        HashMap<String, ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[j].length()==1)
                    if(!starters.contains(words[j])){
                        starters.add(words[j]);
                    }
                int length = difference(words[i],words[j]);
                if(length==1){
                	ArrayList<String> temp;
                    if(hm.get(words[j])!=null){
                    	temp = hm.get(words[j]);
                     }
                    else{
                        temp=new ArrayList<String>();
                    }
                    temp.add(words[i]);
                    hm.put(words[j],temp);
                }
            }
        }
        for(int i=0;i<starters.size();i++){
        	
            String now=max_value(starters.get(i),hm);
            if(now.length()>=max){
            	max=now.length();
            	final_set.add(now);
            }
        }
        
        if(final_set.size()==0)
        	return null;
        else if(final_set.size()==1)
        	return final_set.get(0);
        else{
        	return lexi_small(final_set);
        }
    }

	private String lexi_small(ArrayList<String> final_set) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		int sum=0;
		for(int i=0;i<final_set.size();i++){
			for(int j=0;j<final_set.get(i).length();j++){
				sum+=final_set.get(i).charAt(j);
			}
			pq.add(sum);
			hm.put(sum, final_set.get(i));
		}
		return hm.get(pq.poll());
	}

	private String max_value(String starter, HashMap<String, ArrayList<String>> hm) {
		// TODO Auto-generated method stub
		if(hm.get(starter)!=null){
		ArrayList<String> temp=hm.get(starter);
		String max="";
		for(int i=0;i<temp.size();i++){
			String now = max_value(temp.get(i),hm);
			if(max.length()<now.length()){
				max=now;
			}
		}
		return max;
		}
		else{
			return starter;
		}
		
	}

	private int difference(String w1, String w2) {
		// TODO Auto-generated method stub
		int diff=w1.length()-w2.length();
		int so_far=0;
		for(int i=0;i<w2.length();i++){
			if(i<w1.length()){
				if(w1.charAt(i)!=w2.charAt(i)){
					so_far++;
				}
			}
			else{
				break;
			}
		}
		return diff+so_far;
	}
}
