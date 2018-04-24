package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Best_time_to_buy_and_sell_stock {
	public static void main(String[] args){
		int[] prices={1,3,2,8,4,9};
				
		int fee=2;
		System.out.println(maxProfit(prices,fee));
	}
	 public static int maxProfit(int[] prices, int fee) {
	        int cash = 0, hold = -prices[0];
	        for (int i = 1; i < prices.length; i++) {
	            cash = Math.max(cash, hold + prices[i] - fee);
	            hold = Math.max(hold, cash - prices[i]);
	        }
	        return cash;
	    }
/*	public static int maxProfit(int[] prices, int fee) {
		ArrayList<ArrayList<Integer>> maindiv = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sub = new ArrayList<Integer>();
        HashMap<ArrayList<Integer>,Integer> hm=new HashMap<ArrayList<Integer>,Integer>();
        int start=Integer.MAX_VALUE,end=Integer.MIN_VALUE;
        int profit=0,diff=0;
        //for finding all the increasing subsequence
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]<0){
            	diff++;
                if(start!= Integer.MAX_VALUE && end != Integer.MIN_VALUE){
            	//System.out.println(prices[i]);
            	//System.out.println(prices[i-1]);
                sub.add(start);
                sub.add(end);
                //System.out.println(sub);
                if(start!=end){
                    profit += end-start-fee;
                        
                    hm.put(sub,end-start-fee);
                        }
                        else{
                            hm.put(sub,0);
                        }
                maindiv.add(sub);
                sub = new ArrayList<Integer>();
                start=Integer.MAX_VALUE;end=Integer.MIN_VALUE;
                
                }
            }
            else if(prices[i-1]==prices[i]){
            	continue;
            }
            else{
                if(prices[i-1]<start){
                    start=prices[i-1];
                }
                if(prices[i]>end){
                    end=prices[i];
                }
            }
        }
        if(start!= Integer.MAX_VALUE && end != Integer.MIN_VALUE){
        sub.add(start);
        sub.add(end);
        //System.out.println(sub);
        profit += end-start-fee;
        hm.put(sub,end-start-fee);
        maindiv.add(sub);
        }
        System.out.println(maindiv);
        if(start== Integer.MAX_VALUE && end == Integer.MIN_VALUE)
        	diff++;
        //System.out.println(diff);
        if(diff==prices.length-1)
            return 0;
        int tempsum=0;
        //find the maximum profit by checking all the combinations
        for(int i=0;i<maindiv.size();i++){
            for(int j=i+1;j<maindiv.size();j++){
                for(int k=0;k<i;k++){
                	
                    ArrayList<Integer> temp = maindiv.get(k);
            //        System.out.print(temp+" ");
                    tempsum+=hm.get(temp);
                }
          //      System.out.println(tempsum);
                ArrayList<Integer> temp1 = maindiv.get(i);
                ArrayList<Integer> temp2 = maindiv.get(j);
                start = temp1.get(0);
                end = temp2.get(1);
                tempsum+=end-start-fee;
              /*  System.out.print(temp1+" ");
                System.out.print(temp2+" ");*/
            //    System.out.println(tempsum);
             /*   for(int k=j+1;k<maindiv.size();k++){
                    ArrayList<Integer> temp3 = maindiv.get(k);
                    //System.out.println(temp3+" ");
                    tempsum+=hm.get(temp3);
                }*/
                /*
                System.out.println(tempsum);
                System.out.println(profit);
                */
              /*  if(profit<tempsum){
                    profit=tempsum;
                }
                tempsum=0;
            }
            
        }
        if(profit>0)
        return profit;
        else return 0;
    }*/
}
