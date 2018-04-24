package leetcode;

public class Divide_two_integers {
    public static int divide(int dividend, int divisor) {
        int factor=0,neg=0;
        if(dividend<0){
            if(divisor>0)
            {
                dividend=Math.abs(dividend);
                neg=1;
            }
            else{
                dividend=Math.abs(dividend);
                divisor=Math.abs(divisor);
                neg=0;
            }
        }
        else if(divisor<0){
            if(dividend>0)
            {
                divisor=Math.abs(divisor);
                neg=1;
            }
            else{
                dividend=Math.abs(dividend);
                divisor=Math.abs(divisor);
                neg=0;
            }
        }
        
        if(dividend<divisor){
            return 0;
        }
        else if(dividend == divisor){
            if(neg==0)
            return 1;
            else
            return -1;
        }
        else{
            while(dividend>=0){
                factor++;
                dividend -= divisor;
            }
            if(neg==0)
            return factor-1;
            else
            return -(factor-1);
           // return factor;
        }
    }
    public static void main(String args[]){
    	System.out.println(divide(-18,6));
    }
}
