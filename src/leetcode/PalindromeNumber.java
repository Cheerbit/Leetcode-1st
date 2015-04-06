package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 1:23:44 AM
 * Dec 15, 2014
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x){
		if (x<0) return false;
		
		int div=10; //start from 10 since single digit number is palindrome
		while(x/div >=10) div *= 10;
		
		while(x>10){
			int left = x/div;
			int right = x%10;
			if(left!=right) return false;
			x = (x % div) /10;
			div /= 100;
		}
		
		return true;
	}
	
}
