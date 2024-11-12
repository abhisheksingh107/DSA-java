package com.abhishek;

public class Buy_And_Sell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyandSell(prices));
    }
    static int buyandSell(int[] prices){
        int maxPrice = 0; // To track the maximum profit
        int minPrice = Integer.MAX_VALUE;  // To track the minimum price seen so far
        // Iterate over each price in the prices array
        for(int price : prices){
            // Update the minimum price encountered so far
            minPrice = Math.min(minPrice, price);
            // Calculate the potential profit by selling at the current price
            int profit = price - minPrice;
            // Update the maximum profit if the current profit is greater than the previously found maximum profit
            maxPrice = Math.max(maxPrice, profit);
        }
        // Return the maximum profit after going through all the prices
        return maxPrice;
    }
}
