class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0, count = 0;//k*(k+1)/2
        // if 0 add count +1
        //else do nothing 
        for (int num : nums) {
            count = (num == 0) ? count + 1 : 0; 
            result += count;
        }
        return result;
    }
}
