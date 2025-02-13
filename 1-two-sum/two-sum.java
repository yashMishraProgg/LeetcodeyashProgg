class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // Return result when a solution is found
                }
            }
        }
        return result; // In case no solution is found (though this would be an issue as per Two Sum problem requirements)
    }
}
