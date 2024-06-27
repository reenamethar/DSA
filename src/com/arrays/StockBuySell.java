package com.arrays;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {1, 5, 3, 8, 12};
		System.out.println(maxProfit(prices));

	}
	public static int maxProfit(int[] prices) {
		int profit=0;
		for(int i=1; i<prices.length; i++) {
			if(prices[i] >prices[i-1]) {
				profit += (prices[i]- prices[i-1]);
			}
		}
		return profit;
	}

}
