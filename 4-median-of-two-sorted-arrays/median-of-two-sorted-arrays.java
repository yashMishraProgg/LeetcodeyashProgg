class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] mergedNums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedNums, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedNums, nums1.length, nums2.length);
        Arrays.sort(mergedNums);

        int n = mergedNums.length;
        if (n % 2 == 1) {
            return mergedNums[n / 2];
        } else {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            return (mergedNums[mid1] + mergedNums[mid2]) / 2.0;
        }
    }
}    