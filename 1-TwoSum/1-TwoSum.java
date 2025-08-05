// Last updated: 8/5/2025, 7:46:06 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j-i]+nums[j] == target){
                    return new int[]{j-i,j};
                }
            }
        }
        return nums;
    }
}