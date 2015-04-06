package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 8:19:35 PM
 * Dec 19, 2014
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. 
The number of elements initialized in A and B are m and n respectively.
 */
public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
        int tail = m+n-1;
        m--;n--;
        while (n>=0){
        	if(m<0 || A[m] <= B[n]){
        		A[tail--] = B[n--];
        	}else{
        		A[tail--] = A[m--];
        	}
        }
    }
}
