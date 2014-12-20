package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 7:40:12 PM
 * Dec 19, 2014
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
public class RemoveNthFromEndOfList {
	  public ListNode removeNthFromEnd(ListNode head, int n) {
	      
	      ListNode first = head;
	      ListNode second = head;
	      
	      for(int i =1;i<=n;i++){
	    	   second = second.next;
	      }
	      if(second==null){
	    	    head = head.next;
	    	    return head;
	      }
	      
	      while(second.next!=null){
	    	  first = first.next;
	    	  second = second.next;
	      }
	      
	      first.next = first.next.next;
	      
	      return head;
	    }
	  
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}
