import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // lexicographically
        String s1 = strs[0]; // First string
        String s2 = strs[strs.length - 1]; // Last string
        
        int index = 0;
        while (index < s1.length() && index < s2.length()) {
            if (s1.charAt(index) == s2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return index == 0 ? "" : s1.substring(0, index);
    }
}
