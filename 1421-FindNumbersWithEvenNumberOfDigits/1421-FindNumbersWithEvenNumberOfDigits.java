// Last updated: 8/5/2025, 7:45:13 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if (((int)Math.log10(i)) % 2 == 1){
                count++;
            }
        }
        return count;
    }    
}