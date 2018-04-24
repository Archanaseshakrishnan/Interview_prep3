package leetcode;

public class Palindrome_string {
	class Solution(object):
	    def countSubstrings(self, s):
	        """
	        :type s: str
	        :rtype: int
	        """
	        listy = {}
	        res = []
	        for i in range(len(s)):
	            if s[i] not in listy:
	                nl = []
	                nl.append(i)
	                listy[s[i]] = nl
	            else:
	                nl = listy[s[i]]
	                
	                self.fun_check(s,nl,i,res)
	                
	                nl.append(i)
	                listy[s[i]]=nl
	        return len(s)+len(res)
	    
	    def fun_check(self,s,nl,i,res):
	        for j in nl:
	            word = s[j:i+1]
	            
	            ret = self.check_if_pal(word)
	            if ret == True:
	                res.append(word)
	                
	    def check_if_pal(self, word):
	        n = len(word)
	        if n%2 == 0:
	            #even
	            midi = n//2
	            midj = midi-1
	        else:
	            mid = n//2
	            midi = mid+1
	            midj = mid-1
	        
	        while(midi<n and midj>=0 and word[midi]==word[midj]):
	                midi+=1
	                midj-=1
	        if midj<0 and midi >=n:
	                return True
	        return False
	                
	        
	        
}
