package leetcode;
class Solution {
    public int maxArea(int[] height) {
        int maxcap = 0;
        maxcap = fun_recurse(maxcap,height,0,height.length-1);
        return maxcap;
    }
    public int fun_recurse(int total_capacity,int[] a,int start, int end){
        if(end-start>=0){
            if(end-start==1){
                if(a[start]<a[end])
                    return a[start];
                else{
                    return a[end];
                }
            }
            else{
                int this_min=Integer.MAX_VALUE,min_index=0;
                for(int i=start;i<=end;i++){
                    if(a[i]<this_min){
                        this_min=a[i];
                        min_index=i;
                    }
                }
                if(this_min*(end-start+1)>total_capacity){
                    total_capacity=this_min*(end-start+1);
                }
                int comp = Math.max(fun_recurse(total_capacity,a,0,min_index-1),fun_recurse(total_capacity,a,min_index+1,end));
                return Math.max(comp,total_capacity);
            }
        }
        else{
            return -1;
        }
    }
}
public class Container_with_most_water {

}
