package com.abhishek;

public class Buy_And_Sell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(buyandSell(prices));
    }
    static int buyandSell(int[] prices){
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices){
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxPrice = Math.max(maxPrice, profit);
        }
        return maxPrice;
    }
}
