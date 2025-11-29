// Last updated: 11/29/2025, 11:11:26 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        //basically if sum % k = remainder = no of opeartions needed
4
5        int sum = 0;
6
7        for(int i=0;i<nums.length;i++){
8            sum += nums[i];
9        }
10       return sum % k;
11    }
12}