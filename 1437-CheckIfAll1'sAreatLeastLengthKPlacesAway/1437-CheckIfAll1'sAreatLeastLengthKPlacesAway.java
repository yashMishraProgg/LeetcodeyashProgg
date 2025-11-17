// Last updated: 11/17/2025, 11:05:18 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        //simple logic
        //we store first and next pos of 1
        //and we subtract if (distance <= k) -> false else true
      
       int index1  = -1;

       //to store previous index 
       int index2  = -1;

       int n = nums.length;

       for(int i = 0; i<n;i++){
        
        if(nums[i] == 1){
            index2  = index1;    //store previous
            index1 = i ;         //store current
          
           //caluclate the distance between first and previous index
           int diff =  Math.abs(index1 - index2);

           if(index1 != -1 && index2 != -1 && diff <= k){
            return false;
           }
        }
       }
       return true;
    }
}