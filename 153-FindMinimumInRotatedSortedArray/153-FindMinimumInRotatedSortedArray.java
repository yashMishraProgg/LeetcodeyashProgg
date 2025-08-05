// Last updated: 8/5/2025, 7:45:46 PM
class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
    while (low < high) {
        int mid = (low + high) / 2;
        if (nums[mid] > nums[high]) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return nums[low];
    }
}