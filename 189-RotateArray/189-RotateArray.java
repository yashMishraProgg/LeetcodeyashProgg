// Last updated: 8/5/2025, 7:45:42 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; //to handle the cases when k>n
        
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);

        //reverse whole array
        reverse(nums,0,n-1);


    }
     static  void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=  nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
     }
}