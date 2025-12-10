// Last updated: 12/10/2025, 11:57:21 PM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        String binary = Integer.toBinaryString(n);
4        char[] arr = binary.toCharArray();
5
6        for (int i = 1; i < arr.length; i++) {
7            if (arr[i] == arr[i - 1]) {
8                return false;
9            }
10        }
11        return true;
12    }
13}