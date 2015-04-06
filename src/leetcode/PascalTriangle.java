package leetcode;

import java.util.ArrayList;

/**
 * Created by 7 
 * @Buffalo
 * 7:30:13 PM
 * Dec 19, 2014
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalTriangle {
  public ArrayList<ArrayList<Integer>> generate(int numRows){
	  ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
	  if(numRows <= 0){
		  return results;
	  }
	  ArrayList<Integer> previous = new ArrayList<Integer>();
	  for(int i =1;i<=numRows;i++){
		  ArrayList<Integer> current = new ArrayList<Integer>();
		  for(int j=0; j< i;j++){
			  if(j==0 || j==i-1){
				  current.add(1);
			  }else{
				  current.add(previous.get(j-1) + previous.get(j));
			  }
		  }
		  results.add(current);
		  previous = current;
	  }
	  return results;
	  
  }
}
