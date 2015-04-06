package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 5:10:50 PM
 * Jan 4, 2015
 * Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 */
public class ReverseWordsInString {
	public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
        		if (s.charAt(i) == ' ') {
        			j = i;
        		} else if (i == 0 || s.charAt(i - 1) == ' ') {
        			if(sb.length() != 0){
        				sb.append(' ');
        			}
        			sb.append(s.substring(i,j));
        		}
        }
        return sb.toString();
    }
}
