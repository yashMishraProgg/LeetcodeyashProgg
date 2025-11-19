// Last updated: 11/19/2025, 10:26:15 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        //simple logic if found origigal - double it 
        //and start from i = 0 and scan

        int i = 0;

        while(i < nums.length){
            if(nums[i] == original){
                original = original * 2;
                i = -1;         //to scan back from start
            }
            i++;   //to move next if not found 
        }

        return original;
    }
}