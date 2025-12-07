// Last updated: 12/7/2025, 11:33:41 PM
1class Solution {
2    public int countOdds(int low, int high) {
3       //optimized solution
4       //so after calculating  we have found that 
5       //if atleast one in low and high is odd -> add +1 = no of odds
6       //if both are even , dont add one 
7       //formula is (low-high)/2 + 1(if both are odd)
8
9
10      return (high - low) / 2 + ((low % 2 != 0 || high % 2 != 0) ? 1 : 0);
11    }
12}
13