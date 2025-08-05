// Last updated: 8/5/2025, 7:45:23 PM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if the middle element is the single one
            if (mid % 2 == 1) mid--; // Ensure mid is even
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    } 
 }