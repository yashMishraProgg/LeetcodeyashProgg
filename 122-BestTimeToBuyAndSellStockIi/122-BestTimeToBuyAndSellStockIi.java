// Last updated: 8/5/2025, 7:45:48 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0; 
        
        for (int i = 1; i < n; i++) { 
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        System.gc();
        return maxProfit; 
    }
}