class Solution {
    public int triangularSum(int[] nums) {
        //logic is simple
        //first calculate the sum of first 2 nums and decrease the size , each time until n >= 1;

        int n = nums.length;

        for(int size = n-1; size >= 1; size--){
            for(int i=0;i< size ; i++){
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
        }
        return nums[0];
    }
}