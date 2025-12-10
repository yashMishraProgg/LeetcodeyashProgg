// Last updated: 12/10/2025, 11:53:38 PM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3         n = n ^ (n>>1);
4        return (n & n+1) == 0;
5    }
6}