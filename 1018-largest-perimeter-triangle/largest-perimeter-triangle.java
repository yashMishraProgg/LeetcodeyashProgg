class Solution {
    public int largestPerimeter(int[] nums) {
        //only logic is here that after sorting if
        // a+b > c then all sides are valid for a triangle 

    int n = nums.length;

    Arrays.sort(nums);

        for(int i = n-3; i>=0 ; i--){

            if(nums[i] + nums[i+1] > nums[i+2]){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
    }
}