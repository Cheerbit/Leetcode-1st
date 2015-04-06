package Leetcode;

import java.util.ArrayList;

/**
 * Created by 7
 * 
 * @BayArea 4:44:41 PM Mar 21, 2015 Given a string containing only digits,
 *          restore it by returning all possible valid IP address combinations.
 * 
 *          For example: Given "25525511135",
 * 
 *          return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
 */
public class RestoreIPAddress {
	private boolean isValidField(String s) {
		if (s.length() == 1
				|| (!s.isEmpty() && s.length() < 4 && !s.startsWith("0"))) {
			int num = Integer.parseInt(s);
			if (num >= 0 && num <= 255)
				return true;
		}
		return false;
	}

	private void getAllIps(String s, int n, StringBuilder path,
			ArrayList<String> res) {
		if (n == 1) {
			if (isValidField(s))
				res.add(path.toString() + s);
			return;
		}

		for (int i = 1, len = path.length(); i <= 3 && i < s.length(); i++) {
			String field = s.substring(0, i);
			if (isValidField(field))
				getAllIps(s.substring(i), n - 1,
						path.append(field).append('.'), res);
			path.delete(len, path.length());
		}
	}

	public ArrayList<String> restoreIpAddress(String s) {
		ArrayList<String> res = new ArrayList<String>();
		getAllIps(s, 4, new StringBuilder(), res);
		return res;
	}

}
