package Leetcode;

/**
 * Created by 7 
 * @BayArea
 * 11:30:55 PM
 * Jan 4, 2015
 * Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction 
(ie, buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.
 */
public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		int profit = 0, buyDay = 0, sellDay = 1;
		while (sellDay < prices.length) {
			int curProfit = prices[sellDay] - prices[buyDay];
			if(curProfit <= 0) buyDay = sellDay;
			profit = Math.max(curProfit, profit);
			sellDay++;
		}
		return profit;
	}
}
