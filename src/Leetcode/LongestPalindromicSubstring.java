package Leetcode;
/*
 * Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {
	private String expandAroundCenter(String s, int left, int right) {
		while ( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left --; right ++;
		}
		return s.substring(left+1, right);
	}
	
	public String longestPalindrome(String s) {
		  String result = "";
	      if(s.length()==1) return s;
	        
	        for(int i = 0; i < s.length()-1; i++){
	        	String s1 = expandAroundCenter(s,i,i);
	        	String s2 = expandAroundCenter(s,i,i+1);
	        	
	        	if(s1.length()>result.length()){
					result = s1;
				}
				if(s2.length()>result.length()){
					result = s2;
				}
				
	        }
	        
	        return result;
		
	}
	
}


