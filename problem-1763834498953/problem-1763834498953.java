// Last updated: 11/22/2025, 11:31:38 PM
class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean inSegment = false;

        for (char c : s.toCharArray()) {

            // If current character is NOT space
            // and we were NOT already inside a segment
            if (c != ' ' && !inSegment) {
                count++;        // New segment starts
                inSegment = true;
            }
            // If current character IS space → segment ended
            else if (c == ' ') {
                inSegment = false;
            }
        }
        return count;
    }
}
