package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 7 
 * @Buffalo
 * 9:53:40 PM
 * Dec 15, 2014
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
public class BinaryTreeLevelOrderBottom {
	 public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        
	        if(root==null){
	        	 return result;
	        }
	        
	       Queue<TreeNode> tmp = new LinkedList<TreeNode>();
	        tmp.add(root);
	        
	       while(!tmp.isEmpty()){
	        	ArrayList<Integer> level = new ArrayList<Integer>();
	        	int size = tmp.size();
	        	
	        	for(int i=0; i<size; i++){
	        		TreeNode node = tmp.poll();
	        		level.add(node.val); //add from left to right for this level
	        		if(node.left !=null){
	        			tmp.add(node.left);
	        		}
	        		if(node.right!=null){
	        			tmp.add(node.right);
	        		}
	        		
	        	}
	        	result.add(0,level); //add current level to first index of result list (leaf to root)
	        	
	        }
	      return result;
	    }
}
