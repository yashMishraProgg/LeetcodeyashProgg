class Solution {
    public int longestSubarray(int[] nums) {
        int prevOnesCount = 0;
        int currOnesCount = 0;
        int maxLength = 0;

        for (int val : nums) {
            if (val == 1) {
                currOnesCount++;
            } else {
                //if two consecutive zero , prev = curr = 0
                prevOnesCount = currOnesCount;
                currOnesCount = 0;
            }
            maxLength = Math.max(maxLength, prevOnesCount + currOnesCount);
        }

        return maxLength == nums.length ? maxLength - 1 : maxLength;
    }
}


// class Solution {
//     public int longestSubarray(int[] nums) {
//         int zeroCount = 0;
//         int maxlength = 0;
//          //usong sliding window approach
//         int i = 0;

//         for(int j = 0;j<nums.length,j++){
//             if(nums[j] == 0){
//                 zeroCount++;

//                 while(zeroCount >1){
//                     if(nums[i] == 0){
//                           zeroCount--;
//                           i++;
//                     }                 
//                 }
//                 maxlength = Math.max(maxlength,j-i);
//             }
//         }
//         return maxlength;
//     }
// }