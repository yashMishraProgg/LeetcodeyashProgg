class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case-1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case-2
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            // case-3
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Added return statement
    }

    public int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target greater, ignore left half
            if (arr[mid] < target)
                start = mid + 1;

            // If target is smaller, ignore right half
            else
                end = mid - 1;
        }

        // Element is not present in the array
        return -1;
    }
}
