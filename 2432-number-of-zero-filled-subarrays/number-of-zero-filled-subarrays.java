class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //1 - k  = k*(k+1)/2;
        long result = 0;
        long count = 0;
        //if see consecutive zeroes => give k*(k+1)/2 zeroes subarray
        for(int arr : nums ){
            if(arr == 0){
                count+=1;
                result+= count;
            } else {
                // no zero =>
                count = 0;
            }
        }
        return result;
    }
}
