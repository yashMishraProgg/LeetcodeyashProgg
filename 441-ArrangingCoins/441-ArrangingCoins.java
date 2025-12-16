// Last updated: 12/16/2025, 11:55:16 PM
1class Solution {
2      public int arrangeCoins(int n) {
3        long start = 1;
4        long end = n;
5        long ans = 0;
6        long mid = 0;
7        
8        while(start <= end) {
9            mid = start + (end-start)/2;
10            
11            long coinCount = (mid*(mid+1))/2;
12                
13                if(coinCount <= n){
14                    ans = mid;
15                    start = mid+1;
16                } else {
17                    end = mid-1;
18                }
19        }
20return (int)ans;
21    }
22}