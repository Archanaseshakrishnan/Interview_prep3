package leetcode;

public class Intersection_of_linked_list {
	# Definition for singly-linked list.
	# class ListNode(object):
	#     def __init__(self, x):
	#         self.val = x
	#         self.next = None

	class Solution(object):
	    def getIntersectionNode(self, headA, headB):
	        """
	        :type head1, head1: ListNode
	        :rtype: ListNode
	        """
	        tempA = headA
	        tempB = headB
	        set1 = set()
	        while(tempA != None):
	            set1.add(tempA)
	            tempA = tempA.next
	        
	        while(tempB != None):
	           # print set1
	            if tempB not in set1:
	                set1.add(tempB)
	            else:
	                return tempB
	            tempB = tempB.next
	        return None
}
