package leetcode;
/*
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
By listing and labeling all of the permutations in order, we get the following sequence (ie, for n = 3):
"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the k-th permutation sequence.
Note: Given n will be between 1 and 9 inclusive.
 */
public class PermutationSequence {
	 public String getPermutation(int n, int k) {  
		   if (n <= 0 || k <= 0) return "";  
		   
		   // factorials of n  
		   int[] fact = new int[n];  
		   // an array of n numbers  
		   StringBuilder nums = new StringBuilder();  
		   // pre-compute factorials  
		   for (int i=1; i<=n; ++i) {  
		     nums.append(i);  
		     if (i == 1)  
		       fact[i-1] = 1;  
		     else  
		       fact[i-1] = fact[i-2] * i;  
		   }  
		   
		   // normalize k so that it is within range [0 .. n!]
		   while (k > fact[n-1]) k -= fact[n-1];  
		   k -= 1; // convert to 0-based
		   
		   // compute the permutation  
		   for (int i=0; i<n-1; ++i) {  
		     int factorial = fact[n-2-i]; // (n-1-i)!  
		     int id = k / factorial + i;  
		     // shift the numbers  
		     char num = nums.charAt(id);  
		     for (int j=id; j>i; --j) nums.setCharAt(j, nums.charAt(j-1));  
		     nums.setCharAt(i, num);  
		     while (k >= factorial) k -= factorial;  
		   }  
		   
		   // convert to string  
		   return nums.toString();  
		 }  
}
