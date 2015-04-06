package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 4:58:03 PM
 * Dec 20, 2014
 * Implement strStr().

Returns the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.

 */
public class StrStr {
	public int strStr(String haystack, String needle) {
		if(needle.length()==0){
			return 0;
		}
		if(needle.length()>haystack.length()){
			return -1;
		}
    
		int i = 0,j = 0;
		while(i<haystack.length() && j<needle.length()){
    			if(haystack.charAt(i) == needle.charAt(j)){
    				i++; j++;
    				if(j == needle.length()){
    				return i-j;
    				}
    			}
    			else{
    				i = i-j+1;
    				j = 0;
    				}
			}
		return -1;
	}
}
