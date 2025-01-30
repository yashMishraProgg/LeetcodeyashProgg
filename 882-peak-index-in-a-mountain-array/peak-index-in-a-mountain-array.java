class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int start = 0;
        int end = arr.length-1;
         while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We are in the decreasing part of the array.
                // This may be the answer, but look at the left.
                end = mid;
            } else {
                // We are in the increasing part of the array.
                // So the peak must be on the right.
                start = mid + 1;
            }
        }
        return start; // Or end, both are correct.
    }
}