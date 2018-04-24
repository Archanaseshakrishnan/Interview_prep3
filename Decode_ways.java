package leetcode;

public class Decode_ways {
	public int numDecodings(String s) {
        if(s.equals("0"))
            return 0;
        int deduct=0;
        int count=s.length();
      //  System.out.println(count+"-"+deduct);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
            {deduct++;
            //System.out.println(deduct);
            }
            if(s.charAt(i)<='2'){
                if(i+1<s.length()){
                    if(s.charAt(i)<='1' && s.charAt(i+1)!='0'){
                        count++;
                        //System.out.println(i+"--"+s.charAt(i+1));
                    }
                    else{
                        if(s.charAt(i)<='6' && s.charAt(i+1)!='0'){
                            count++;   
                           // System.out.println("there");
                        }
                    }
                }
            }
        }
     //   System.out.println(count+"-"+deduct);
        return count-deduct;
    }
}
