// Last updated: 9/18/2025, 10:30:06 PM
class Solution {
    public int lengthOfLastWord(String s) {
        
        int n = s.length();
        int count = 0;
      
        while(n > 0 && s.charAt(n-1) == ' '){
            n--;
        }

        while(n > 0 && s.charAt(n-1) != ' ')
        {
            count++;
            n--;
        }

        return count;
    }
}