package leetcode;

import java.util.ArrayList;

/**
 * Created by 7
 * 
 * @BayArea 5:08:06 PM Apr 5, 2015 Given n pairs of parentheses, write a
 *          function to generate all combinations of well-formed parentheses.
 * 
 *          For example, given n = 3, a solution set is:
 * 
 *          "((()))", "(()())", "(())()", "()(())", "()()()"
 */
public class GenerateParentheses {
	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> result = new ArrayList<String>();
		generator(n, 0, 0, new StringBuilder(), result);
		return result;
	}

	private void generator(int n, int l, int r, StringBuilder sb,
			ArrayList<String> result) {
		if (l==n) {
			while(r++ < n) {
				sb = sb.append(")");
			}
			result.add(sb.toString());
		} else if (l==r) {
			generator(n, l+1, r, sb.append("("), result);
		} else {
			int oldLen = sb.length();
			generator(n, l+1, r, sb.append("("), result);
			sb = sb.delete(oldLen, sb.length());
			generator(n, l, r+1, sb.append(")"), result);
		}
	}
}
