package leetcode;

import java.util.ArrayList;

/**
 * Created by 7 
 * @BayArea
 * 11:25:08 AM
 * Apr 19, 2015
 * Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.
 */
public class DivideTwoIntegers {
	public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        long a = dividend, b = divisor;
        boolean neg = false;
        if (a < 0) {
            neg = !neg;
            a = Math.abs(a);
        }
        if (b < 0) {
            neg = !neg;
            b = Math.abs(b);
        }
        int count = 0;
        while (b << count <= a) {
            count++;
        }
        int ans = 0;
        while (count >= 0) {
            if (b << count <= a) {
                a -= b << count;
                ans |= 1 << count;
            }
            count--;
        }
        return neg ? -ans : ans;
    }

}
