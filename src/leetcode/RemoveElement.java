package leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 10:50:53 AM
 * Dec 20, 2014
 * Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

/*
 * if we count the number of known occurrence, 
 * we can move the next not-to-remove element directly to the right spot. By doing this, 
 * we only need to iterate through all elements once, which gives us an O(n) solution.
 */
public class RemoveElement {
	public int removeElement(int[] A, int elem) {
        int count=0;
        
        for(int i=0; i<A.length; i++){
        	  if(A[i]==elem){
        		  count++;
        	  }else if(count>0){
        		  A[i-count] = A[i];
        	  }
        }
        return A.length-count;
    }
}
