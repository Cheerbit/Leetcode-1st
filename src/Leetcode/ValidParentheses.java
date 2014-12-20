package Leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by 7 
 * @Buffalo
 * 8:07:23 PM
 * Dec 19, 2014
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.

The brackets must close in the correct order, 
"()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

//Use a stack to keep track of open parentheses.
//Each time when we hit a close parenthesis, 
//the top of the stack has to be the matching parenthesis. 
//Otherwise, this string is not a valid parentheses.

public class ValidParentheses {
	
	public boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();  
		   map.put(')', '(');  
		   map.put(']', '[');  
		   map.put('}', '{');  
		   
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(!map.containsKey(c)){
				stack.push(c);
			}else if(stack.empty() || stack.pop()!=map.get(c)){
				return false;
			}
			
		}
		return (stack.isEmpty());
		
		
    }
}
