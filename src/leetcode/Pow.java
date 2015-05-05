package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 6:53:42 PM
 * May 4, 2015
 * Implement pow(x, n).
 */
public class Pow {
	public double pow(double x, int n) {  
		   if (n == 0) return 1;  
		   int exp = Math.abs(n);  
		   double half = pow(x, exp>>1);  
		   double res = half * half;  
		   if ((exp & 1) == 1) res *= x;  
		   return (n > 0) ? res : 1.0/res;  
		 }   
}
