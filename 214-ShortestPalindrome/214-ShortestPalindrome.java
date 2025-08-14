// Last updated: 8/14/2025, 3:33:35 PM
class Solution {
    public String shortestPalindrome(String s) {
        int length = s.length();
        int left = 0;

        for (int right = length - 1; right >= 0; right--) {
            if (s.charAt(right) == s.charAt(left)) {
                left++;
            }
        }

        if (left == length) return s;

        String nonPalindromeSuffix = s.substring(left);
        StringBuilder reverseSuffix = new StringBuilder(nonPalindromeSuffix).reverse();

        return reverseSuffix
                .append(shortestPalindrome(s.substring(0, left)))
                .append(nonPalindromeSuffix)
                .toString();
    }
}
