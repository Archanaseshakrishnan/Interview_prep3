package leetcode;

import java.util.HashMap;

public class sample {
public static void main(String args[]){
	String[] now={"arr", "dhee", "seshu", "taran"};
	HashMap<String,Integer> hm1=new HashMap<String, Integer>();
	HashMap<String,Integer> hm2=new HashMap<String, Integer>();
	hm1.put("seshu", 1);
	hm1.put("arr", 2);
	hm1.put("taran", 5);
	hm1.put("dhee", 4);
	for(String s:now){
		hm2.put(s, hm1.get(s));
		System.out.println(hm2);
	}
	System.out.println(hm2);
	
}
}
