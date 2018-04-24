package leetcode;

public class plusOne {
	public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
            if(carry==0)
                break;
        } 
        if(carry>0){
            int[] newdigits=new int[digits.length+1];
            int j=digits.length;
            for(int i=digits.length-1;i>=0;i--)
                newdigits[j--]=digits[i];
            newdigits[0]=carry;
            return newdigits;
        }
        return digits;
    }
}
