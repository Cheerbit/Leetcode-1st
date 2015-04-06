package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 11:47:24 AM
 * Dec 21, 2014
 * Given a non-negative number represented as an array of digits, plus one to the number.

	The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for(int i = n-1;i >= 0;i--) {
        	 if(digits[i] != 9){
        		 digits[i]++;
        		 return digits;
        	 }else {
        		 digits[i]=0;
        	 }
        }
       
        	int[] digitsNew= new int[n+1];
        	digitsNew[0] = 1;
        	return digitsNew;

	}
}
