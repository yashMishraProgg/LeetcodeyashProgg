/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnostic(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnostic(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    public static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                // We are in the decreasing part of the array.
                end = mid;
            } else {
                // We are in the increasing part of the array.
                start = mid + 1;
            }
        }
        return start;
    }

    public static int orderAgnostic(MountainArray mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            }
            if (isAsc) {
                if (target < mountainArr.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr.get(mid)) {
                    end = mid - 1;
              }  else{
                    start = mid + 1;
                }
            }
        }
        return -1; // target not found
    }
}   