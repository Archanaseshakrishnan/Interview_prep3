package leetcode;

public class Word_search {
	public static boolean exist(char[][] board, String word) {
        int[][] visited=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++)
            { 
                boolean result = fun(i,j,board,visited,word,0); 
                if(result==true)
                    return result;
            }
        }
        return false;
    }
    static boolean fun(int row,int col,char[][] matrix,int[][] visited,String word,int index){
        //System.out.println(index + " " + word.length() + " " + row + " " + col);
        if(index==word.length())
        	return true;
        if(index<word.length() && visited[row][col]!=1 && row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length && matrix[row][col]==word.charAt(index)){
        	boolean f1,f2,f3,f4;
            visited[row][col]=1;
            if(row-1>=0){
                f1=fun(row-1,col,matrix,visited,word,index+1);
            }
            else{
                f1=false;
            }
            if(row+1<matrix.length){
                f2=fun(row+1,col,matrix,visited,word,index+1);
            }
            else{
                f2=false;
            }
            if(col-1>=0){
                f3=fun(row,col-1,matrix,visited,word,index+1);
            }
            else{
                f3=false;
            }
            if(col+1<matrix[0].length){
                f4=fun(row,col+1,matrix,visited,word,index+1);
            }
            else{
                f4=false;
            }
            return (f1 || f2 || f3 || f4);
        }
        else
            return false;
    }
    public static void main(String args[]){
    	char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    	System.out.println(exist(board,"ABCCED"));
    }
}
