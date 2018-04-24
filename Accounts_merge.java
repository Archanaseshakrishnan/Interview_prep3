package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Accounts_merge {
	public static void main(String args[]){
		String[][]accounts = {{"John", "johnsmith@mail.com", "john00@mail.com"}, {"John", "johnnybravo@mail.com"}, {"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"Mary", "mary@mail.com"}};
		List<List<String>> r=new ArrayList<List<String>>();
		List<String> s = new ArrayList<String>();
		for(int i=0;i<accounts.length;i++){
			s = new ArrayList<String>();
		for(int j=0;j<accounts[i].length;j++){
			s.add(accounts[i][j]);
		}
		r.add(s);
		}
		System.out.println(accountsMerge(r));
	}
	public static List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result=new ArrayList<List<String>>();
        for(int i=0;i<accounts.size();i++){
        	List<String> ac1 = accounts.get(0);
            String key=ac1.get(0);
            int ifpresent = fun(key, result);
            if(ifpresent==-1)
            {
            	result.add(ac1);
            }
            else{
            	fun2(ac1, result, ifpresent);
            }
        }
		return result;
    }

	private static void fun2(List<String> ac1, List<List<String>> result, int index) {
		// have to make a check from ifpresent index
		String key = ac1.get(0);
		for(int i=index;i<result.size();i++){
			List<String> res=result.get(i);
			if(res.get(0).equals(key)){
				//check if any one of the value is repeated
				boolean check=fun3(res,ac1);
				if(check){
					for(int j=1;j<ac1.size();j++){
						res.add(ac1.get(i));
					}
					break;
				}
			}
		}
	}

	private static boolean fun3(List<String> res, List<String> ac1) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<res.size();i++){
			hs.add(res.get(i));
		}
		for(int i=0;i<ac1.size();i++){
			if(hs.contains(ac1.get(i)))
			return true;
		}
		return false;
	}

	private static int fun(String key, List<List<String>> result) {
		// TODO Auto-generated method stub
		for(int i=0;i<result.size();i++){
			List<String> ac=result.get(i);
			if(ac.get(0).equals(key)){
				return i;
			}
		}
		return -1;
	}
}
