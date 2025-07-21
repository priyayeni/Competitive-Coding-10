// TC : O(n) SC : O(1)
/*This approach works by taking advantage of every small increase in stock price. Instead of trying to guess the best single day to 
buy and sell, we simply buy whenever the price goes up the next day and sell  immediately to lock in that profit. 
By repeating this for every upward movement, we collect all the small gains, which together give us the maximum possible profit 
if we’re allowed to trade as often as we like. */

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        // Edge case: if the array is empty, no profit can be made
        if (n == 0) return 0;

        int max = 0; // Variable to store the total maximum profit

        // Loop through the price array starting from the second day
        for (int i = 1; i < n; i++) {
            // If today's price is higher than yesterday's, we can make a profit
            if (prices[i] > prices[i - 1]) {
                // Add the profit from this transaction
                max += prices[i] - prices[i - 1];
            }
        }

        // Return the total profit
        return max;
    }
}
