package leetcode;
/*
 * Given a binary tree, flatten it to a linked list in-place.

For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
 */
public class FlattenBinaryTreeToLinkedList {
	public void flatten(TreeNode root) {
		TreeNode cur = root;
		while (cur != null) {
			if (cur.left != null) {
				if (cur.right != null) {
					TreeNode next = cur.left;
					while(next.right != null) next = next.right;
					next.right = cur.right;
				}
				cur.right = cur.left;
				cur.left = null;
			}
			cur = cur.right;
		}
	}
}
