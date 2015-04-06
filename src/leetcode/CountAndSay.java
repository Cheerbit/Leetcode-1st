package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 10:15:04 PM
 * Dec 21, 2014
 * The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 */
public class CountAndSay {
	public String countAndSay(int n) {
        if (n <= 0) return null;
        StringBuilder result = new StringBuilder("1");
        for (;n>1;n--) {
        		StringBuilder tmp = new StringBuilder();
        		int count = 1;
        		for (int i = 1; i< result.length(); i++) {
        			if (result.charAt(i) == result.charAt(i-1)){
        				count++;
        			} else {
        				tmp.append(count);
        				tmp.append(result.charAt(i-1));
        				count = 1;
        			}
        		}
        		tmp.append(count);
        		tmp.append(result.charAt(result.length()-1));
        		result = tmp;
        }
        return result.toString();
    }
}
