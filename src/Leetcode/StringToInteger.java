package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 12:54:46 AM
 * Dec 15, 2014
 * Implement atoi to convert a string to an integer.
- Does input string have whitespace?
Possibly. It may start from whitespace characters and those characters can be ignored.
- What if the input string has other invalid characters?
Valid characters for an integer could be '+', '-', '0' - '9', and whitespace according to previous question.
Here you can assume the first non-whitespace character in the input string must be plus, minus, or a numeric digit, which is followed by as many numeric digits as possible. 
The input string may have invalid characters after those digits and the invalid characters can be ignored.
- What if the input string is not valid? What would be the expected behavior, throwing out an exception or return some specific value?
If the input string is invalid, return zero.
- What if the resulting value is out of the range of Integer?
Return INT_MAX (2147483647) or INT_MIN (-2147483648) as needed.

now we know the input string is in the following pattern:
^\\s*[+-]?[0-9]+.*$
which starts with zero or more whitespace, 
follows by an optional plus/minus sign, 
several numeric digits, 
and zero or more other characters.
 */
public class StringToInteger {
	public int atoi(String str){
		long res=0; int index=0;
		
		//trim leading whitespace
		while(index < str.length() && str.charAt(index)==' ') 
			index++;
		if(index == str.length()) return (int)res;
		
		//get sign
		int sign=1;
		if(str.charAt(index)=='-'){
			index++;
			sign=-1;
		}else if(str.charAt(index)=='+'){
			index++;
		}
		
		//convert digits
		while(index<str.length() && Character.isDigit(str.charAt(index))){
			res = res*10 + (str.charAt(index++)-'0');
			if(sign>0 && res> Integer.MAX_VALUE) return Integer.MAX_VALUE;
			else if (sign<0 && res< Integer.MIN_VALUE) return Integer.MIN_VALUE;
		}
		return (int)res*sign;
	}
}
