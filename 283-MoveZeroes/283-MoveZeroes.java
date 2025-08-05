// Last updated: 8/5/2025, 7:45:32 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
    }
}