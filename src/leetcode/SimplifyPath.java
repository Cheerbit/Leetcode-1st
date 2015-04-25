package leetcode;

import java.util.Stack;

/**
 * Created by 7 
 * @BayArea
 * 2:22:53 PM
 * Apr 19, 2015
 * Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
click to show corner cases.

Corner Cases:
Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, 
such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
 */
public class SimplifyPath {
	public String simplifyPath(String path) {
		if (path == null || path.charAt(0) != '/') return null;
		String[] splits = path.split("/");
		
		Stack stack = new Stack();
		for (String split : splits) {
			if (split.equals("..") && !stack.isEmpty()) {
				stack.pop();
			} else if (!split.equals(".") && !split.equals("..") && !split.isEmpty()) {
				stack.push(split);
			}		
		}
		
		if (stack.isEmpty()) return "/";
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.insert(0, "/" + stack.pop());
		}
		return sb.toString();
				
	}
	
	
}
