package leetcode;

public class Shortest_completing_word {
	class Solution(object):
	    def shortestCompletingWord(self, licensePlate, words):
	        """
	        :type licensePlate: str
	        :type words: List[str]
	        :rtype: str
	        """
	        lp = re.sub('[^A-Za-z]+', '', licensePlate)
	        lp = lp.lower()
	        #print lp
	        # print lp
	        minlen = 999999999
	        minword = ""
	        found = 1
	        for j in words:
	            #temp = ''.join(sorted(j.lower()))
	            #print temp
	            temp = j
	            for i in lp:
	                #print "i: "+i
	                if i not in temp:
	                    found = 0
	                    break
	                else:
	                    temp = temp.replace(i,'',1)
	               # print "temp after replace: "+temp
	            if found == 1:
	               # print "first found: "+j
	                if minlen > len(j):
	                    minlen = len(j)
	                    minword = j
	            found = 1
	        return minword
}
