package leetcode;

public class One_bitand2_bitcharacter {
	public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length,set=0;
        for(int i=0;i<n;i++){
            if(bits[i]==1){
                if(i+1<n)
                i++;
                else
                    return false;
            }
            else{
                if(i==n-1){
                    set=1;
                }
            }
        }
        if(set==1)
            return true;
        return false;
    }
}
