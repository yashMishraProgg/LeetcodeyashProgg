// Last updated: 8/5/2025, 7:45:33 PM
class Solution {
    public int missingNumber(int[] nums) {
         int n = nums.length;
    int i  = 0;
    while(i<n){
        int correct = nums[i];
        if(nums[i]< n && nums[i]!= nums[correct]){
           swap(nums,i,correct);
        }else{
            i++;
        }
    }
    //Case 1
    //Find the first index
    for(int index = 0; index<n;index++){
        if(nums[index]!=index){
            return index;
        }
    }
    //Case 2
    return n;
 }

 
    
    public static void swap(int nums[],int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}