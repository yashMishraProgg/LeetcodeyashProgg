// Last updated: 10/28/2025, 11:14:29 PM
class Solution {
    public int thirdMax(int[] nums) {
        //sort the array
        Arrays.sort(nums);
        int n = nums.length, cnt = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (nums[i] != nums[i - 1]) 
                cnt++;
            if (cnt == 3)
                return nums[i - 1];
        }

        return nums[n - 1];
    }
}