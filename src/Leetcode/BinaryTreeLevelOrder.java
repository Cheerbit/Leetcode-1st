package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by 7 
 * @Buffalo
 * 6:00:32 PM
 * Dec 19, 2014
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */
public class BinaryTreeLevelOrder {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
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
        	result.add(level); //add current level to result list (root to leaf)
        	
        }
      return result;
    }
}
