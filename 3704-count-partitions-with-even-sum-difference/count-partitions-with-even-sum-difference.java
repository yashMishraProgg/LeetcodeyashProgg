class Solution {
    public int countPartitions(int[] nums) {
        //simple logic
        //leftsum - rightsum could be express as leftsum - (total_sum - leftsum)
        //so it becomes 2*leftsum - totalsum
        //so we need to check if totalsum is even then diff would be even else no split
        
        long totalsum = 0;
        if(nums.length < 2){
            return 0;   //no split possible
        }

        for(int i = 0;i<nums.length;i++){
            totalsum += nums[i];
        }

        return (totalsum % 2 == 0) ? nums.length - 1 : 0;
    }
}