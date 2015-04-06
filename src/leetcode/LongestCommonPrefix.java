package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 6:36:28 PM
 * Dec 19, 2014
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

/*
 * There are two ways to get the longest common prefix:
(DFS-like) 
Find a common prefix of the first two strings, 
compare that common prefix with the third one to find a common prefix of the first three, 
and so on, until find the common prefix of all strings.

(BFS-like) 
Start from the first character. 
Compare whether the first character of all strings are the same, if so, move to next; 
otherwise, return the longest common prefix.

In worst cases, both methods need to go through all strings. 
But on average, the second one would be slightly faster.

 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        int index=0;
        while(index<strs[0].length()){
        	 char c =strs[0].charAt(index);
        	 for(int i = 1; i<strs.length;i++){
        		 if(index >=strs[i].length() || strs[i].charAt(index) !=c){
        			 return strs[0].substring(0,index);
        		 }
        	 }
        	 index++;
        }
        
    	return strs[0];
}
}