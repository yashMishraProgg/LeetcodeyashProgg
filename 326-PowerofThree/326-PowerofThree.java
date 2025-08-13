// Last updated: 8/13/2025, 5:28:56 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        //haha max power of 3(Power 19) = 1162261467
        return n > 0 && 1162261467 % n == 0;
    }
}
