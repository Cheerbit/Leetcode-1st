package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 7:42:30 PM
 * Dec 14, 2014
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
	private String normalize(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length();i++){
        	char c = s.charAt(i);
        	if((c < 'a' || c > 'z') && (c<'A' || c > 'Z') && (c < '0' || c > '9'))
        	 continue;
        	if (c >= 'A' && c <= 'Z') 
        		c = (char)(c - ('A' - 'a')); 
        	sb.append(c);
        }  
        return sb.toString();   
    }
	
	/** Remove non-alphanumeric char and change to lowercase  
	  * ss = normalize(s) is equivalent to  
	  *  ss = s.toLowerCase().replaceAll("[^a-z0-9]", "");  
	  */  
	
	public boolean isPalindrome(String s){
		String ss= normalize(s);
		int left=0, right =ss.length()-1;
		while(left<right){
			if(ss.charAt(left++) != ss.charAt(right--)) return false;
		}
		return true;
	}
}
