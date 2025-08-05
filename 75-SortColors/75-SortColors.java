// Last updated: 8/5/2025, 7:45:51 PM
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap mid and low
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++; // leave 1
            } else {
                // Swap mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                // do NOT increment mid here
            }
        }
    }
}
