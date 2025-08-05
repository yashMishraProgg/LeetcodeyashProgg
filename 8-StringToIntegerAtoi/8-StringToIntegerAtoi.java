// Last updated: 8/5/2025, 7:46:02 PM
class Solution {
    public int myAtoi(String s) {
        int res = 0, sign = 1, idx = 0;
        int n = s.length();

        // Ignore leading whitespaces
        while (idx < n && s.charAt(idx) == ' ') {
            idx++;
        }

        // Check for sign
        if (idx < n && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            sign = (s.charAt(idx) == '-') ? -1 : 1;
            idx++;
        }

        // Build the number
        while (idx < n && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            // Check for overflow
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + (s.charAt(idx) - '0');
            idx++;
        }

        return res * sign;
    }
}