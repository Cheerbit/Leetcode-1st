package Leetcode;

import java.util.ArrayList;

/**
 * Created by 7 
 * @Buffalo
 * 5:56:37 PM
 * Dec 14, 2014
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

 */
public class PascalTriangleII {
	public ArrayList<Integer> getRow(int rowIndex) {
      ArrayList<Integer> result= new ArrayList<Integer>();
      if(rowIndex < 0){
    	  return result;
      }
      
      int[] row = new int[rowIndex +1];
      row[0] = 1; //first element is known;
            
      
      for(int i=1; i<=rowIndex; i++){
    	  	for(int j=i; j>0; j--){
    	  		row[j]= row[j] + row[j-1];
    	  	}
      }
      //for rowIndex=4,  row 0 =[1,?,?,?,?]
      //calculate each row in place
      //row 0 = [1]
      //row 1 = [1,1]
      //start from row 1 to row 4 (forward)
      //start from last element (backward)
          
      for(int i=0; i<row.length;i++){
    	  if(row[i]!=0){
    		  result.add(row[i]);
    	  }
    	  }
      return result;
      
      
    }
}
