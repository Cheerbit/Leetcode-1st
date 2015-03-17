package Leetcode;

import java.util.ArrayList;

/**
 * Created by 7 
 * @BayArea
 * 6:11:25 PM
 * Mar 16, 2015
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.

For example,
Given n = 3, your program should return all 5 unique BST's shown below.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
 */
public class UniqueBSTII {
	private ArrayList<TreeNode> genSubTrees(int start, int end) {
		ArrayList<TreeNode> trees = new ArrayList<TreeNode>();
		if (start > end) {
			trees.add(null);
		} else {
			for (int i = start; i <= end; i++) {
				ArrayList<TreeNode> lefts = genSubTrees(start, i-1);
				ArrayList<TreeNode> rights = genSubTrees(i+1, end);
				for (int j = 0; j< lefts.size(); j++) {
					for (int k = 0; k< rights.size(); k++) {
						TreeNode node = new TreeNode(i);
						node.left = lefts.get(j);
						node.right = rights.get(k);
						trees.add(node);
					}
				}
				
			}
		}
		return trees;
	}
	
	public ArrayList<TreeNode> generateTrees(int n) {
		return genSubTrees(1,n);
	}
}
