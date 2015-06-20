package leetcode;

import java.util.Stack;

/**
 * Created by 7 
 * @BayArea
 * 6:32:47 PM
 * Jun 14, 2015
 */
public class LongestValidParentheses {
	 public int longestValidParentheses(String s) {  
		   int maxLen = 0, last = -1;  
		   Stack<Integer> lefts = new Stack<Integer>();  
		   for (int i=0; i<s.length(); ++i) {  
		     if (s.charAt(i)=='(') {  
		       lefts.push(i);  
		     } else {  
		       if (lefts.isEmpty()) {  
		         // no matching left  
		         last = i;  
		       } else {  
		         // find a matching pair  
		         lefts.pop();  
		         if (lefts.isEmpty()) {  
		           maxLen = Math.max(maxLen, i-last);  
		         } else {  
		           maxLen = Math.max(maxLen, i-lefts.peek());  
		         }  
		       }  
		     }  
		   }  
		   return maxLen;  
		 } 
}
