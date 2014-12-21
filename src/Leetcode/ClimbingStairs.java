package Leetcode;

/**
 * Created by 7 
 * @Buffalo
 * 11:17:49 AM
 * Dec 20, 2014
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. 
In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
	public int climbStairs(int n){
		if(n<=0) return 0;
		if(n==1 || n==2) return n;
		int[] ways= new int[n];
		ways[0]=1;
		ways[1]=2;
		for(int i=2;i<n;i++){
			ways[i]=ways[i-1] + ways[i-2];
		}
		return ways[n-1];
	}
}
