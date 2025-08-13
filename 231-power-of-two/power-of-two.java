class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0; //any n&(n-1) always be a power of 2
    }
}
//alternative
// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n < 1) return false;
        
//         while (n % 2 == 0) {
//             n /= 2;
//         }
        
//         return n == 1;
//     }
// }

