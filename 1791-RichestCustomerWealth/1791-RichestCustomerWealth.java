// Last updated: 8/5/2025, 7:45:08 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans  = Integer.MIN_VALUE;
        //person = row
        //account = column;
        for(int[] ints: accounts){
          int sum = 0;
          for(int col: ints){
            sum = sum+col;
          }
          if(sum>ans){
            ans = sum;
          }
        }
        return ans;
    }
}