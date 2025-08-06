class Solution {
    public double myPow(double x, int n) {
        long power = n; 
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1;
        while (power > 0) {
            //if pow is odd only
            if (power % 2 == 1) {
                result *= x;    
            }
            x *= x;            // Square the base
            power /= 2;        // Divide exponent by 2
        }

        return result;
    }
}
