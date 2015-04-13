package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 8:38:25 PM
 * Apr 5, 2015
 * Given a linked list and a value x, 
 * partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */
public class PartitionList {
	
	public ListNode partition(ListNode head, int x) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		ListNode last = dummy;
		while (last.next !=null && last.next.val < x) last = last.next;
		
		ListNode node = last;
		while (node.next != null) {
			if (node.next.val < x) {
				ListNode tmp = node.next;
				node.next = tmp.next;
				tmp.next = last.next;
				last.next = tmp;
				last = last.next;
			} else {
				node = node.next;
			}
		}
		return dummy.next;
	}
}
