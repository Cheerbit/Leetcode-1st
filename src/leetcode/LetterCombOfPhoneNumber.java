package leetcode;

import java.util.ArrayList;

/**
 * Created by 7
 * 
 * @BayArea 11:44:50 AM Mar 9, 2015 Given a digit string, return all possible
 *          letter combinations that the number could represent.
 * 
 *          A mapping of digit to letters (just like on the telephone buttons)
 *          is given below. 0 = none 1 = none 2 = ABC 3 = DEF 4 = GHI 5 = JKL 6
 *          = MNO 7 = PQRS 8 = TUV 9 = WXYZ Input:Digit string "23" Output:
 *          ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class LetterCombOfPhoneNumber {
	public ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> result = new ArrayList<String>();
		char[] str = new char[digits.length()];
		letterCombinations(digits, 0, result, str);
		if (result.size()==0) result.add("");
		return result;
	}

	public void letterCombinations(String digits, int current,
			ArrayList<String> result, char[] str) {
		String[] letters = { "0","1","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv",
		"wxyz" };
		if (current == digits.length()) {
			result.add(new String(str));
			return;
		}
		for (int i = 0; i < letters[digits.charAt(current) - '0'].length(); i++) {
			str[current] = letters[digits.charAt(current) - '0'].charAt(i);
			letterCombinations(digits, current+1, result, str);
		}
	}
}
