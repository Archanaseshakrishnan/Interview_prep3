package leetcode;

public class Find_pivot_index {
public int pivotIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            if(i!=0 && i!=nums.length-1){
                int j=i-1;
                int sum1=0,sum2=0;
                for(int k=0;k<=j;k++){
                    sum1+=nums[k];
                }
                for(int k=i+1;k<nums.length;k++){
                    sum2+=nums[k];
                }
                if(sum1==sum2){
                    return i;
                }
            }
            else{
                if(i==0){
                    int sum1=0;
                    for(int j=1;j<nums.length;j++)
                        sum1+=nums[j];
                    if(sum1==0)
                        return i;
                }
                if(i==nums.length-1){
                    int sum1=0;
                    for(int j=0;j<nums.length-1;j++)
                        sum1+=nums[j];
                    if(sum1==0)
                        return i;
                }
            }
            }
        return -1;
        }
}
