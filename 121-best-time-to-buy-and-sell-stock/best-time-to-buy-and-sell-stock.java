class Solution {
    public int maxProfit(int[] prices) {
        int minsoFar = prices[0];
        int res = 0;

        for(int i=1;i<prices.length;i++){
            minsoFar = Math.min(minsoFar,prices[i]);

            res = Math.max(res,prices[i]-minsoFar);
        }
         return res;
    }
}