// Last updated: 12/5/2025, 8:07:39 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3        //simple logic
4        //leftsum - rightsum could be express as leftsum - (total_sum - leftsum)
5        //so it becomes 2*leftsum - totalsum
6        //so we need to check if totalsum is even then diff would be even else no split
7        
8        long totalsum = 0;
9        if(nums.length < 2){
10            return 0;   //no split possible
11        }
12
13        for(int i = 0;i<nums.length;i++){
14            totalsum += nums[i];
15        }
16
17        return (totalsum % 2 == 0) ? nums.length - 1 : 0;
18    }
19}