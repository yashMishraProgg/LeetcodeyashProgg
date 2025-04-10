class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        // Iterate through all elements using two loops
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Compare nums[i] with the rest of the elements
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // Check if the current element is the majority element
            if (count > n / 2) {
                return nums[i];
            }
        }
        
         throw new IllegalArgumentException("No majority element found.");
    }
}