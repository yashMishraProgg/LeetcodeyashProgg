class Solution {
    public int climbStairs(int n) {
        //Either take one step (n-1)
        //or two steps (n-2) => Like fibonacci series

         if (n <= 1) return 1;

         int[] dp = new int[n+1];
         dp[0] = 1;
         dp[1] = 1;

         for (int i = 2; i <= n; i++) {
         dp[i] = dp[i-1] + dp[i-2];
        }

    return dp[n];
    }
}