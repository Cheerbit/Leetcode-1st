package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 11:17:55 AM
 * Apr 12, 2015
 * Given two numbers represented as strings, 
 * return multiplication of the numbers as a string.

Note: The numbers can be arbitrarily large and are non-negative.
 */
public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0")) return "0";
		int l1 = num1.length(), l2 = num2.length();
		int[] n1 = new int[l1];
		int[] n2 = new int[l2];
		int[] res = new int[l1 + l2];
		
		for(int i = 0; i<l1; i++) {
			n1[i] = num1.charAt(i) - '0';
		}
		
		for(int i = 0; i<l2; i++) {
			n2[i] = num2.charAt(i) - '0';
		}
		
		for (int i = 0; i< l1; i++) {
			for (int j = 0; j < l2; j++) {
				res[i+j+1] += n1[i] * n2[j];
			}
		}
		
		StringBuilder ss = new StringBuilder();  
		   for (int k=l1+l2-1; k>=0; --k) {  
		     ss.append((char)(res[k] % 10 + '0'));  
		     if (k>0) res[k-1] += res[k] / 10;  
		   }  
		   // trim 0's  
		   int count = ss.charAt(ss.length()-1)=='0' ? 1 : 0; 
		   String s = ss.reverse().substring(count, ss.length());  
		   return (s.isEmpty()) ? "0" : s;  
		
	}
}
