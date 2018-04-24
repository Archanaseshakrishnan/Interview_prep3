package leetcode;
class Solution:
    def wordBreak(self, s, di):
        """
        :type s: str
        :type wordDict: List[str]
        :rtype: bool
        """
        if len(s)>=1:
            if s in di:
                return True
            
        for i in range(len(s)):
            if s == "":
                return True
            stri = s[:i]
            print(stri)
            if stri in di:
                s = s[i:]
        
        stri = s[:i]
        if stri in di:
                s = s[i:]
        if s == "":
            return True
        else:
            return False
public class Word_break {

}
