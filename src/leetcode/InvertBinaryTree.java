package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 7:34:51 PM
 * Jun 14, 2015
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}
