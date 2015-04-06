package Leetcode;

/**
 * Created by 7 
 * @BayArea
 * 6:24:22 PM
 * Mar 21, 2015
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.
 */
public class DecodeWays {
	public int numDecodings(String s) {  
		   int len = s.length();  
		     
		   int w1 = (len <= 0) ? 0 : 1, w2 = w1;  
		   for (int i=1; i<=len; ++i) {  
		     char c = s.charAt(i-1);
		     int temp = w2; // w1 = count[i-2], temp = w2 = count[i-1]

		     // update w2 to be count[i]
		     if ( c == '0' )  w2 = 0;  
		     if ( i-1 > 0 && isTwoDigitCode(s.charAt(i-2), c) ) {  
		       w2 += w1;  
		     }  
		     if ( w2 == 0 ) return 0;  // invalid

		     // set w1 = temp = count[i-1], i.e. A[(i+1)-2]
		     w1 = temp;
		   }  
		   return w2;  
		 }  
	
	private boolean isTwoDigitCode(char a, char b) {  
		   return (a=='1' || (a=='2' && b>='0' && b<='6'));  
		 }

}
