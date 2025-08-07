class Solution {
    private int ans = 0;

    public int reversePairs(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return ans;
    }

    private void merge(int[] arr, int l, int m, int r) {
        int lftsize = m - l + 1;
        int rgtsize = r - m;
        int[] left = new int[lftsize];
        int[] right = new int[rgtsize];

        // Copy contents to temp arrays
        for (int i = 0; i < lftsize; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < rgtsize; i++) {
            right[i] = arr[m + 1 + i];
        }

        // Count reverse pairs
        int i = 0, j = 0;
        int count = 0;
        while (i < lftsize) {
            while (j < rgtsize && (long) left[i] > 2L * right[j]) {
                j++;
            }
            count += j;
            i++;
        }
        ans += count;

        // Merge step to sort
        i = 0; j = 0;
        int k = l;
        while (i < lftsize && j < rgtsize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < lftsize) {
            arr[k++] = left[i++];
        }
        while (j < rgtsize) {
            arr[k++] = right[j++];
        }
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
