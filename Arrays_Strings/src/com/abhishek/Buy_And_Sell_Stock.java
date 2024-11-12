package com.abhishek;

public class Buy_And_Sell_Stock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices){
        int totalProfit = 0;
        // Iterate through the prices array
        for (int i = 0; i < prices.length -1; i++) {
            // If the price increases from the current day to the next day
            if(prices[i+1] > prices[i]){
                // Add the profit from this transaction
              totalProfit += prices[i+1] - prices[i];
            }
        }
        // Return the total accumulated profit
        return totalProfit;
    }
}


/*

Input: [7, 1, 5, 3, 6, 4]

Day 1 to Day 2: Price goes from 7 to 1, no profit (skip).
Day 2 to Day 3: Price goes from 1 to 5, profit = 5 - 1 = 4 (add 4 to total profit).
Day 3 to Day 4: Price goes from 5 to 3, no profit (skip).
Day 4 to Day 5: Price goes from 3 to 6, profit = 6 - 3 = 3 (add 3 to total profit).
Day 5 to Day 6: Price goes from 6 to 4, no profit (skip).
Total profit = 4 + 3 = 7.

Output: 7



 */
