package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 7:50:48 PM
 * May 5, 2015
 * Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? 
Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
 */
public class PopulatingNextRightPointersII {
	public void connect(TreeLinkNode root) {  
		   TreeLinkNode first = root;  
		   while (first != null) {  
		     TreeLinkNode cur = first;  
		     // set up next pointers for the next level  
		     while (cur != null) {  
		       // find the next node that has at least one child  
		       TreeLinkNode next = cur.next;  
		       while (next != null && next.left == null && next.right == null) next = next.next;  
		       // the next child  
		       TreeLinkNode nextChild = null;  
		       if (next != null) nextChild = (next.left != null) ? next.left : next.right;  
		       // set up next pointers for the children of current node  
		       if (cur.left != null && cur.right != null) {  
		         cur.left.next = cur.right;  
		         cur.right.next = nextChild;  
		       } else if (cur.left != null) {  
		         cur.left.next = nextChild;  
		       } else if (cur.right != null) {  
		         cur.right.next = nextChild;  
		       }  
		       // move to next has-child node  
		       cur = next;  
		     }  
		     // move to next level  
		     while (first != null && first.left == null && first.right == null) first = first.next;  
		     if (first != null) first = (first.left != null) ? first.left : first.right;  
		   }  
		 } 
}

