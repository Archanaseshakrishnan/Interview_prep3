package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Longest_increasing_path_in_a_matrix {
	static int max = 0;
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0)
            return 0;
        int[][] dp=new int[matrix.length][matrix[0].length];
        Longest_increasing_path_in_a_matrix.max = 0;
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                System.out.println(helper(matrix,i,j,matrix.length,matrix[0].length,0,dp));
        if(Longest_increasing_path_in_a_matrix.max==Integer.MIN_VALUE)
            return -1;
        return Longest_increasing_path_in_a_matrix.max;
    }
    int helper(int[][]matrix,int r,int c,int m,int n,int count,int[][] dp){
        
            if(r+1<m){
                if(matrix[r+1][c]>matrix[r][c]){ 
                    if(dp[r+1][c]==0){
                        int val = helper(matrix, r+1, c, m, n, count+1,dp);
                        if(dp[r+1][c]<val)
                            dp[r+1][c]=val;
                    }
                    if(dp[r][c]<(dp[r+1][c]+1))
                        dp[r][c]=dp[r+1][c]+1;
                    if(Longest_increasing_path_in_a_matrix.max<dp[r][c])
                    	Longest_increasing_path_in_a_matrix.max=dp[r][c];
                }
            }
            if(r-1>=0){
                if(matrix[r-1][c]>matrix[r][c]){
                    if(dp[r-1][c]==0){
                        int val = helper(matrix, r-1, c, m, n, count+1,dp);
                        if(dp[r-1][c]<val)
                            dp[r-1][c]=val;
                    }
                    if(dp[r][c]<(dp[r-1][c]+1))
                        dp[r][c]=dp[r-1][c]+1;
                    if(Longest_increasing_path_in_a_matrix.max<dp[r][c])
                    	Longest_increasing_path_in_a_matrix.max=dp[r][c];
                }
            }
            if(c+1<n){
                if(matrix[r][c+1]>matrix[r][c]){
                    if(dp[r][c+1]==0){
                        int val = helper(matrix, r, c+1, m, n, count+1,dp);
                        if(dp[r][c+1]<val)
                            dp[r][c+1]=val;
                    }
                    if(dp[r][c]<(dp[r][c+1]+1))
                        dp[r][c]=dp[r][c+1]+1;
                    if(Longest_increasing_path_in_a_matrix.max<dp[r][c])
                    	Longest_increasing_path_in_a_matrix.max=dp[r][c];
                }
            }
            if(c-1>=0){
                if(matrix[r][c-1]>matrix[r][c]){
                    if(dp[r][c-1]==0){
                        int val = helper(matrix, r, c-1, m, n, count+1,dp);
                        if(dp[r][c-1]<val)
                            dp[r][c-1]=val;
                    }
                    if(dp[r][c]<(dp[r][c-1]+1))
                        dp[r][c]=dp[r][c-1]+1;
                    if(Longest_increasing_path_in_a_matrix.max<dp[r][c])
                    	Longest_increasing_path_in_a_matrix.max=dp[r][c];
                }
            }
            if(dp[r][c]==0)
                dp[r][c]=1;
            if(Longest_increasing_path_in_a_matrix.max<dp[r][c])
            	Longest_increasing_path_in_a_matrix.max=dp[r][c];
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            List<Integer> res=new ArrayList<Integer>();
            
            return dp[r][c];
        
    }
}
