package COREJAVA2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai6 {
    //Bài tập 6: You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
    // future to sell that stock.
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    //Input: prices = [7,1,5,3,6,4]
    //Output: 5
    //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    public static int maxProfit(List<Integer> prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            }

            int profit = price - minPrice;
            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>(Arrays.asList(7, 1, 5, 3, 6, 4));

        int maxProfit = maxProfit(prices);
        System.out.println("Result: " + maxProfit);
    }
}
