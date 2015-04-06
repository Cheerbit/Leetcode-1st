package leetcode;

/**
 * Created by 7 
 * @BayArea
 * 11:16:34 PM
 * Jan 4, 2015
 * Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. 
You may complete as many transactions as you like 
(ie, buy one and sell one share of the stock multiple times). 
However, you may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).
 */
public class BestTimetoBuyandSellStockII {
	public int maxProfit(int[] prices){
		int totalProfit = 0;
		for (int day = 1; day < prices.length; day++){
			int profit = prices[day] - prices[day-1];
			if(profit > 0) totalProfit += profit;
		}
		return totalProfit;
 }
	
}
