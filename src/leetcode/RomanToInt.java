package leetcode;

import java.util.HashMap;

/**
 * Created by 7 
 * @Buffalo
 * 6:02:42 PM
 * Dec 19, 2014
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInt {
	public int romanToInt(String s) {
         if(s ==null || s.length() <= 0){
        	   return 0;
         }
         
         HashMap<Character, Integer> map= new HashMap<Character, Integer>();
         map.put('I', 1);
         map.put('V', 5);
         map.put('X',10);
         map.put('L', 50);
         map.put('C', 100);
         map.put('D', 500);
         map.put('M', 1000);
         
         if(s.length()==1){
        	  return map.get(s.charAt(0));
         }
         
         int sum = 0;
         int i=0;
         
         while(i<s.length() -1){
        	  if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
        		  sum += map.get(s.charAt(i+1)) - map.get(s.charAt(i));
        		  i +=2;
        	  }else{
        		  sum += map.get(s.charAt(i));
        		  i++;
        	  }
         }
         if(map.get(s.charAt(s.length()-2))>=map.get(s.charAt(s.length()-1))){
        	   sum += map.get(s.charAt(s.length()-1));
         }
         return sum;  
         
    }
}
