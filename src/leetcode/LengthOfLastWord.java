package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 3:22:40 PM
 * Dec 14, 2014
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example, 
Given s = "Hello World",
return 5.

 */
public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		int len=0, last=s.length()-1;
		
		while(last>=0 && s.charAt(last) == ' ') 
			last--;
		while(last>=0 && s.charAt(last)!= ' ') 
		{
			len++; last--;
		}
		return len;
		}
		
        
    }

