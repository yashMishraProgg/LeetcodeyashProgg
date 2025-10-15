class Solution {
    public boolean check(int[] nums) {
        
        //the count should be not be greater than 1 for rotated + sorted
        int count = 0;
        int n  = nums.length;

        for(int i = 0; i< n; i++){
            if(nums[i] > nums[(i+1)% n]){
                count ++;
            }
        }

        if(count > 1){
            return false;
        }
        return true;
    }
}