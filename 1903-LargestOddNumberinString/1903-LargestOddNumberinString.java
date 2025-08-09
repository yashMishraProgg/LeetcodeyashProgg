// Last updated: 8/10/2025, 1:36:52 AM
class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            int d = c - '0';//Convert string to number
            if ((d & 1) == 1) { // odd cause every binary of odd number is 1 so any odd with &(and) 1 will be 1
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}