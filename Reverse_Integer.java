package leetcode;
class Solution {
    public int reverse(int x) {
        if(x<10 && x>-10){
            return x;
        }
        int orig=x;
        x=Math.abs(x);
        String res;
        StringBuilder r=new StringBuilder();
        for(int i=x;i!=0;i/=10){
            int rem=i%10;
            r.append(String.valueOf(rem));
        }
        res=new String(r);
        if(orig<0)
            res="-"+res;
        return Integer.parseInt(res);
    }
}
public class Reverse_Integer {

}
