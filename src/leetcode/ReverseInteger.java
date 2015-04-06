package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 12:36:35 AM
 * Dec 15, 2014
 * 
 */
public class ReverseInteger {
	public int reverse(int x) {
		int ret = 0;
		while (x != 0) {
		// handle overflow/underflow
		if (Math.abs(ret) > 214748364) {
		   return 0;
		}
		 ret = ret * 10 + x % 10;
		 x /= 10; 
		 }
		 return ret; 
	}
}

//Example Questions Candidate Might Ask:
//Q: What about negative integers?
//A: For input x = –123, you should return –321.
//Difficulty: Easy, Frequency: High
//￼￼Q: What if the integer’s last digit is 0? For example, x = 10, 100, ...
//A: Ignore the leading 0 digits of the reversed integer. 10 and 100 are both reversed as 1.
//Q: What if the reversed integer overflows? For example, input x = 1000000003. A: In this case, your function should return 0.
