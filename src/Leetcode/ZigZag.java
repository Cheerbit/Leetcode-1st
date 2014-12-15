package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 11:53:54 PM
 * Dec 14, 2014
 *  The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 *  (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

 */
public class ZigZag {
	public String convert(String s, int nRows) {
		  if (s == null)
		    return null;
		  int len = nRows <= 1 ? nRows : (2 * nRows - 2); //length of one zigzag
		  StringBuilder sb = new StringBuilder();
		  
		  for (int offset = 0; offset < nRows; offset++) {
		    for (int zigIndex = 0; zigIndex * len < s.length(); zigIndex++) {
		      int firstIndex = zigIndex * len + offset;
		       if (firstIndex >= 0 && firstIndex < s.length())
		              sb.append(s.charAt(firstIndex));
		       if (offset > 0 && offset < nRows - 1) {
		        int reverseIndex = (zigIndex + 1) * len - offset;
		        if (reverseIndex >= 0 && reverseIndex < s.length())
		          sb.append(s.charAt(reverseIndex));
		      }
		    }
		  }
		  return sb.toString();
		}
}

