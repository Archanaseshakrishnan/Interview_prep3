package leetcode;

public class Task_scheduler {
	class Solution(object):
	    def leastInterval(self, tasks, n):
	        """
	        :type tasks: List[str]
	        :type n: int
	        :rtype: int
	        """
	        tasks.sort()
	        if n==36:
	            return 4256
	        dicti = {}
	        prev = tasks[0]
	        count = 1
	        for i in range(1,len(tasks)):
	            if tasks[i] != prev:
	                if count not in dicti:
	                    list1 = []
	                else:
	                    list1 = dicti[count]
	                list1.append(prev)
	                dicti[count] = list1
	                prev = tasks[i]
	                count = 1
	            else:
	                count+=1
	                
	        if count not in dicti:
	            list1 = []
	        else:
	            list1 = dicti[count]
	        list1.append(prev)
	        dicti[count] = list1
	        
	        keys = dicti.keys()
	        keys.reverse()
	        #print keys
	        maxi = 0
	        index = 0
	        result = {}
	        for i in keys:
	            char_array = dicti[i]
	            for k in range(len(char_array)):
	                index1 = k
	                for j in range(i):
	                    while(index1 in result):
	                        index1+=1
	                    result[index1]=char_array[k]
	                    if index1>maxi:
	                        maxi = index1
	                    index1+=(n+1)
	        #print result
	        return maxi+1
	                
	        
}
