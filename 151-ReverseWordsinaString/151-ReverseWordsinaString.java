// Last updated: 8/9/2025, 2:05:26 AM
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // leave spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int j = i; // if i=13 set j=13 and again iterate i--
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (j >= 0) { // here space occurs so stop 
                sb.append(s.substring(i + 1, j + 1)).append(" "); // append from i+1(space occurred) to j+1
            }
        }
        return sb.toString().trim();
    }
}
