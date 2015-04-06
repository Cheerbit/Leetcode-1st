package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 12:23:55 PM
 * Dec 21, 2014
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
public class AddBinary {
	public String addBinary(String a, String b) {
		StringBuilder builder = new StringBuilder();
		int al = a.length() - 1, bl = b.length() - 1;
		int carry = 0;
		int bit = 0;
		while(al >= 0 || bl >= 0){
			int A = 0, B = 0;
			if(al >= 0 && bl >= 0){
				A = a.charAt(al) - '0';
				B = b.charAt(bl) - '0';
			}else if(al >= 0){
				A = a.charAt(al) - '0';
				B = 0;
			}else {
				A = 0;
				B = b.charAt(bl) - '0';
			}
			bit = (A + B + carry) % 2;
			carry = (A + B + carry) / 2;
			builder.insert(0, bit);
			al--; bl--;
		}
		if(carry > 0) {
			builder.insert(0, carry);
		}
		return builder.toString();
	}
}
