package leetcode;

public class Can_jump {
	public static boolean canJump(int[] nums) {
		for(int i=0;i<nums.length-1;i++){
            int index=nums[i]+i,j;
            System.out.println(index);
            for(j=index;j<nums.length-1;){
                if(nums[j]==0)
                {break;}
                j = nums[j]+j;
                
            }
            if(j>=nums.length-1)
                return true;
        }
        if(nums.length==1)
            return true;
        return false;
    }
	public static void main(String args[]){
		int[] nums={0,2,3};
		System.out.println(canJump(nums));
	}
}
