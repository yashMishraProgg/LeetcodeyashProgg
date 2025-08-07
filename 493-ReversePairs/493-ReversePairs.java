// Last updated: 8/7/2025, 10:11:34 PM
class Solution {
    public int divide(int arr[], int lower, int upper) {
        int count = 0;
        if (lower >= upper) {
            return count;
        }
            int mid = (lower + upper) / 2;
            count += divide(arr, lower, mid);
            count += divide(arr, mid + 1, upper);
            count += countpaires(arr, lower, mid, upper);
            concquer(arr, lower, mid, upper);
        return count;
    }

    public void concquer(int arr[], int lower, int mid, int upper) {
        int merged[] = new int[upper - lower + 1];
        int idx1 = lower;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= upper) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= upper) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = lower; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public int countpaires(int[] arr, int lower, int mid, int upper) {
        int right = mid + 1;
        int count = 0;
        for (int i = lower; i <= mid; i++) {
            while (right <= upper && (long)arr[i] > 2 * (long)arr[right])
                right++;               
            count += (right - (mid + 1));           
        }
        return count;
    }

    public int reversePairs(int[] nums) {
        int upper = nums.length;
        int count = divide(nums, 0, upper - 1);
        System.gc();
        return count;
    }
}