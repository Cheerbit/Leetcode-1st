package Leetcode;

import java.util.HashMap;

/**
 * Created by 7 
 * @Buffalo
 * 2:21:55 PM
 * Dec 10, 2014
 * Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int start=0;
        int end =0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        while(end<s.length()){
        	char cur = s.charAt(end);
        	if(map.containsKey(cur) && map.get(cur)>=start){
        		maxLen = Math.max(maxLen, end-start);
        		start=map.get(cur) +1;
        		//ex. [a,b,c,b,e,f,a,b]
        		//If we hit a recurrence of a character, it means that we find a substring without repeating characters (ended before this character). 
        		//Suppose we start from s[i] and find out the s[j] is same as s[k], where k<j. 
        		//That said, s[i..j-1] is a substring without repeats. 
        		//That also tells us that there is no repeating characters between k+1 and j.
        	}
        	map.put(cur, end++);
        	//remove characters between i and k from the hash table 
        	//since they are no longer in the current substring
        	//Alternatively, if we keep the index to the latest occurrence of a character, 
        	//we don't need to cleanup the hash table, instead, we compare the index with start pointer to see whether it is in the current substring.

        }
    maxLen=Math.max(maxLen, end-start);
    	return maxLen;   
    }
}
