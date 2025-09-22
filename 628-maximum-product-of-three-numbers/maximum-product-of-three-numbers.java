class Solution {
    public int maximumProduct(int[] nums) {
        
        //logic  is simple
        //num[0] * num[1] => smallest with num[n-1] largest
        //or num[n-1]* num[n-2]*num[n-3] only when array us sorted

        Arrays.sort(nums);

        int case1 = nums[0]*nums[1]*nums[nums.length-1];
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;
    
    }
}