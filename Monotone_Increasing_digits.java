package leetcode;

public class Monotone_Increasing_digits {
	public int monotoneIncreasingDigits(int N) {
        if(N>=10){
        String newnum = String.valueOf(N);
        int now=0,i=1;
        for(i=1;i<newnum.length();i++){
            if(newnum.charAt(i-1)>newnum.charAt(i)){
                now = Integer.parseInt(newnum);    
                break;
            }
        }
            if(i<newnum.length())
        return monotoneIncreasingDigits(--now);
            else
                return N;
    }
        else{
            return N;
        }
    }
}
