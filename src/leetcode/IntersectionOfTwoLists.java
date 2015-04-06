package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 8:30:19 PM
 * Dec 19, 2014
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.

 */
public class IntersectionOfTwoLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
        		return null;
        }
        int lenA=getLen(headA);
        int lenB=getLen(headB);
        
        if(lenA>lenB){
        	while(lenA>lenB){
        		headA=headA.next;
        		lenA--;
        	}
        	}else{
        	while(lenA<lenB){
        		headB=headB.next;
        		lenB--;
        	}
        	}
        
        	
        	
        	while(headA!=null){
        		if(headA==headB){
        			return headA;
        		}
        		headA = headA.next;
        		headB = headB.next;
        	}
        	return null;
        
        	
    }
	
	public int getLen(ListNode node){
		int len=0;
		while(node!=null){
			node = node.next;
			len++;
		}
		return len;
	}
}
