package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 3:40:42 PM
 * May 19, 2015
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).
 */
public class BestTimetoBuyandSellStockIII {
	public int maxProfit(int[] prices) {  
		   int len = prices.length;  
		   if (len==0) return 0;  
		   int[] profitHist = new int[len];  
		   // forward calculate profit  
		   for (int buyDay=0, today=1; today<len; ++today) {  
		     int curP = prices[today] - prices[buyDay];  
		     if (curP <= 0) buyDay = today;  
		     else profitHist[today] = Math.max(curP, profitHist[today-1]);  
		   }  
		   // backward calculate profit  
		   int profit=profitHist[len-1], backProfit=0;  
		   for (int today=len-2, sellDay=len-1; today>0; --today) {  
		     int curP = prices[sellDay] - prices[today];  
		     if (curP <= 0) sellDay = today;  
		     else backProfit = Math.max(curP, backProfit);  
		     profit = Math.max(profit, profitHist[today]+backProfit);  
		   }  
		   return profit;  
		 }  
}
