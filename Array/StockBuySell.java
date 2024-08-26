// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

package Array;

public class StockBuySell {

    public int maxProfit(int[] prices) {
//  At beginning minimum price is the first price
        int buy_price = prices[0];
//  At beginning minimum profit is zero
        int profit = 0;

        for(int i=1;i<prices.length;i++){
//  If current_price is less update the buy_price
            if(prices[i]< buy_price){
                buy_price = prices[i];
            }
            else{
//  else check if we can get a better profit
                int current_profit = prices[i] - buy_price;
                profit = Math.max(current_profit, profit); //It is used to return maximum value from given two arguement
            }
        }
        return profit;
        
    }
    
}
