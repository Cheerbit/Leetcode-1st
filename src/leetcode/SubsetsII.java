package leetcode;

import java.util.*;
/**
 * Created by 7 
 * @BayArea
 * 4:24:28 PM
 * Apr 5, 2015
 * 
 * Given a collection of integers that might contain duplicates, S, 
 * return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If S = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */
public class SubsetsII {
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {  
		   Arrays.sort(num);  

		   ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();   
		   results.add(new ArrayList<Integer>());   
		   int count = 0;   
		   for (int i=0; i<num.length; i++) {   
		     int curSize = results.size();   
		     // count duplicates   
		     if (i > 0 && num[i] == num[i-1]) {   
		       count++;   
		     } else {   
		       count = 0;   
		     }  
		     // append to previous subsets   
		     while (curSize-- > 0) {   
		       ArrayList<Integer> res = new ArrayList<Integer>();   
		       ArrayList<Integer> pre = results.get(curSize);   
		       // for duplicates, only append to subsets containing all previous duplicates   
		       if (count > 0 && (pre.size() < count || pre.get(pre.size()-count) != num[i]))  
		         continue;   
		       res.addAll(pre);   
		       res.add(num[i]);   
		       results.add(res);   
		     }   
		   }   
		   return results;   
		 }
}
