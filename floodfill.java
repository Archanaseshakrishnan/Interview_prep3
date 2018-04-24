package leetcode;

import java.util.ArrayList;

public class floodfill {
	public int[][] floodFill(int[][] img, int sr, int sc, int nc) {
        ArrayList<String> arr=new ArrayList<String>();
        fun(img,sr,sc,nc,arr);
        return img;
    }
    public void fun(int[][] img, int sr, int sc, int nc, ArrayList<String> arr){
        String s = String.valueOf(sr)+","+String.valueOf(sc);
        if(img[sr][sc]!=0 && sr>=0 && sr<=img.length && sc>=0 && sc<=img[0].length){
            img[sr][sc]=nc;
            arr.add(s);
            if(sr-1>=0)
                fun(img,sr-1,sc,nc,arr);
            if(sc-1>=0)
                fun(img,sr,sc-1,nc,arr);
            if(sr+1<=img.length)
                fun(img,sr+1,sc,nc,arr);
            if(sc+1<=img[0].length)
                fun(img,sr,sc+1,nc,arr);
        }
    }
}
