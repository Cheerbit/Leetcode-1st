package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 2:07:49 AM
 * Dec 20, 2014
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDupFromSortedList {
	 public ListNode deleteDuplicates(ListNode head) {
	     if(head==null) return head;
	     
	     ListNode slow = head;
	     ListNode fast = head.next;
	     
	     while(fast!=null){
	    	 if(fast.val!=slow.val){
	    		 slow.next = fast;
	    		 slow = slow.next;
	    	 }
	    	 fast = fast.next;
	     }
	     
	     slow.next=null;
	     return head;	 
	 }
}
