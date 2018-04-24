package leetcode;

public class excel_sheet_col_number {
	class Solution(object):
	    def titleToNumber(self, s):
	        """
	        :type s: str
	        :rtype: int
	        """
	        alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	        rdict = dict([ (x[1],x[0]) for x in enumerate(alfa) ])
	       # print rdict["A"]+1
	        n = len(s)
	        sum1 = 0
	        
	        for i in range(len(s)):
	            print i
	            print s[i],n
	            print math.pow(26,(n-1))
	            print (rdict[s[i]]+1)*math.pow(26,(n-1))
	            sum1+=((rdict[s[i]]+1)*math.pow(26,(n-1)))
	            n-=1
	            
	        return int(sum1)
}
