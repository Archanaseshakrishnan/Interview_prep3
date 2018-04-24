class Solution:
    final_count=9999999999
    def ladderLength(self, beginWord, endWord, wordList):
        """
        :type beginWord: str
        :type endWord: str
        :type wordList: List[str]
        :rtype: int
        """
        if self.distance(beginWord, endWord)<=1:
            return 1
        #pre-processing step
        dictionary = {}
        dictionary[0] = beginWord
        for i in range(len(wordList)):
            dictionary[i+1]=wordList[i]
        graph = {}
        for i in range(len(dictionary)):
            list_new = []
            for j in range(len(dictionary)):
                if self.distance(dictionary[i], dictionary[j])<=1:
                    list_new.append(j)
            graph[dictionary[i]]=list_new
        print (graph)
        print (dictionary)
        visited = []
        self.dfs(graph,dictionary,beginWord,endWord,0, visited,0)
        if self.final_count == 9999999999:
            return 0
        return self.final_count
    
    def dfs(self,graph,dictionary,beginWord,endWord,count, visited,index):
        if index not in visited:
            if beginWord!=endWord:
                visited.append(index)
                list1=graph[beginWord]
                for i in list1:
                    self.dfs(graph,dictionary,dictionary[i],endWord,count+1,visited,i)
            else:
                visited.append(index)
                if(count<self.final_count):
                    self.final_count=count
                
    def distance(self,word1, word2):
        diff = 0
        j = 0
        for i in range(len(word1)):
            if j<len(word2):
                if word1[i]!=word2[j]:
                    diff+=1
                j+=1
            else:
                break
        diff += ((len(word1)-1)-i)
        return diff