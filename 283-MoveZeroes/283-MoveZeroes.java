// Last updated: 10/17/2025, 11:56:10 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i =0;i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                max = Math.max(max, count); //current consecutive max count of 1 before  0 occured
                //reset the count if encounter 0
                count =0;
            }
        }
        max = Math.max(max,count); //compare the old max with new count
        return max;
    }
}