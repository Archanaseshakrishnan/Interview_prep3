package leetcode;

public class Friend_circles {

class Solution(object):
    def findCircleNum(self, M):
        """
        :type M: List[List[int]]
        :rtype: int
        """
        visited = []
        count=0
        vertex = [x for x in range(len(M))]
        for i in range(0,len(M)):
            for j in range(len(M[0])):
                if M[i][j]==1 and i not in visited:
                    if i!=j:
                        self.dfs(i,M,visited)
                        count+=1
                        break
        seti = set(vertex)-set(visited)    
                    
        return count+len(seti)
            
        
    def dfs(self,start,M,visited):
        if start not in visited:
            visited.append(start)
            for j in range(len(M[start])):
                if start!=j and j not in visited and M[start][j]==1:
                    self.dfs(j,M,visited)
            
}
