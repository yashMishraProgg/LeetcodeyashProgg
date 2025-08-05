// Last updated: 8/5/2025, 7:45:57 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
                int firstPosition = findPosition(nums, target, true);
        int lastPosition = findPosition(nums, target, false);
        return new int[]{firstPosition, lastPosition};
    }

    private static int findPosition(int[] nums, int target, boolean isFirst) {
        int low = 0, high = nums.length - 1, position = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                position = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return position;
    }
}