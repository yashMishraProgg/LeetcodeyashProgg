// Last updated: 10/5/2025, 11:45:10 PM
class Solution {
    public int hammingWeight(int n) {
        //The logic is simple 
        //we take a mask and perform and if it gives a set bit => the binary contains a 1.
        int count =  0;
        int mask  =  1;

        for(int i = 0; i< 32; i++){
            if((n & mask) != 0){
                count++;
            }
            mask  = mask << 1;
        }
        return count;
    }
}