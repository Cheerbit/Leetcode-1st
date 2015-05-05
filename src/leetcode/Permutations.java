package leetcode;

import java.util.ArrayList;

/**
 * Created by 7 
 * @BayArea
 * 9:56:37 PM
 * May 4, 2015
 * Given a collection of numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 */
public class Permutations {
	public ArrayList<ArrayList<Integer>> permute(int[] num) {  
		   ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();  

		   if (num.length < 1) return results;  
		   if (num.length == 1) {  
		     ArrayList<Integer> perm = new ArrayList<Integer>();  
		     perm.add(num[0]);  
		     results.add(perm);  
		     return results;  
		   }  

		   for (int i=0; i<num.length; ++i) {  
		     // copy a new array of n-1 numbers  
		     int[] subset = new int[num.length-1];  
		     for (int j=0; j<i; ++j) subset[j] = num[j];  
		     for (int j=i+1; j<num.length; ++j) subset[j-1] = num[j];  
		     // append the current number to the end of pernutations of n-1 subset  
		     for (ArrayList<Integer> perm : permute(subset)) {  
		       perm.add(num[i]); // append to the end, O(1) 
		       results.add(perm);  
		     }  
		   }  
		   return results;  
		 }  
}
