class Solution {
    public int searchInsert(int[] nums, int target) {
        //simple binary search
        int left = 0;
        int right  = nums.length -1;

        while(left <= right){
            int mid = left + (right-left) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid -1;
            } else{
                left = mid + 1;
            }
        }

        //else return left because if the target  is not found then
        //right and mid will be at the pos less than target and
        // left will be at the position or index where the target is to be inserted so 
        return left;
    }
}