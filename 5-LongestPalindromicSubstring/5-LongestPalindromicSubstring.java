// Last updated: 8/12/2025, 7:20:33 PM
class Solution {
    public String longestPalindrome(String s) {
        //check eligibility
        if(s == null && s.length()<1){
            return "";
        }
        int start= 0;
        int maxlen = 1;

        //check for odd
        for(int i=0;i<s.length();i++){
            int len1 = expand(s,i,i); 
           //check for even
           int len2 = expand(s,i,i+1);

           //max length
           int len = Math.max(len1,len2);

          if(len>maxlen){
            maxlen = len;
            start = i - (len-1)/2;
          }
        }
        return s.substring(start,start+maxlen);

    }
     private int expand(String s,int left , int right){
        while(left>=0 &&right <s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
     }
}
//Using while loop 
//class Solution {
//     public String longestPalindrome(String S) {
//         if (S == null || S.length() < 1) return "";

//         int start = 0, maxLen = 1;

//         for (int i = 1; i < S.length(); i++) {
//             // Even case
//             int l = i - 1;
//             int r = i;
//             while (l >= 0 && r < S.length() && S.charAt(l) == S.charAt(r)) {
//                 if (r - l + 1 > maxLen) {
//                     maxLen = r - l + 1;
//                     start = l;
//                 }
//                 l--;
//                 r++;
//             }

//             // Odd case
//             l = i - 1;
//             r = i + 1;
//             while (l >= 0 && r < S.length() && S.charAt(l) == S.charAt(r)) {
//                 if (r - l + 1 > maxLen) {
//                     maxLen = r - l + 1;
//                     start = l;
//                 }
//                 l--;
//                 r++;
//             }
//         }
//         return S.substring(start, start + maxLen);
//     }
// }
