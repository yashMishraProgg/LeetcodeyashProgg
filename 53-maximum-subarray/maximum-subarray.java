class Solution {
    public int maxSubArray(int[] nums) {
     //Kadanes algo => Either use the previous  or make new subarray   
     int max_ending_here = nums[0];

     int maxSofar = nums[0];

     for(int i= 1;i<nums.length;i++){

        max_ending_here = Math.max(nums[i], nums[i] + max_ending_here);

        maxSofar = Math.max(max_ending_here, maxSofar);
     }
     return maxSofar;
    }
}