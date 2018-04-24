package leetcode;

public class First_Unique_character_in_string {
	class Solution(object):
	    def firstUniqChar(self, s):
	        """
	        :type s: str
	        :rtype: int
	        """
	        if len(s)==1:
	            return 0
	        for i in range(len(s)):
	            s1 = s[i+1:]
	            s2 = s[:i]
	            if s[i] not in s1 and s[i] not in s2:
	                return i
	        return -1
}
