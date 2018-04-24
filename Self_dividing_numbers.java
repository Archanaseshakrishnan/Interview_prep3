package leetcode;

public class Self_dividing_numbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int num = i;
            int rem=i;
            for(int j=i;j!=0;j/=10){
                rem = j % 10;
                if(rem!=0){
                if(num%rem!=0){
                    break;
                }
                }
                else{
                    break;
                }
            }
            if(rem!=0){
            if(num%rem==0){
                result.add(num);
            }
            }
        }
        return result;
    }
}
