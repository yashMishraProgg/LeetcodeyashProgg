// Last updated: 8/5/2025, 7:46:00 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int inflpoint = 0;
        int n = nums.length - 1;

       
        for (int i = n; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                inflpoint = i;
                break;
            }
        }

        
        if (inflpoint == 0) {
            Arrays.sort(nums);
        } else {
            int toswapIndex = inflpoint - 1;
            int minGreater = Integer.MAX_VALUE;
            int minIndex = -1;

           
            for (int j = inflpoint; j <= n; j++) {
                if (nums[j] > nums[toswapIndex] && nums[j] <= minGreater) {
                    minGreater = nums[j];
                    minIndex = j;
                }
            }

            
            int temp = nums[toswapIndex];
            nums[toswapIndex] = nums[minIndex];
            nums[minIndex] = temp;

           
            Arrays.sort(nums, inflpoint, n + 1);
        }
    }
}
