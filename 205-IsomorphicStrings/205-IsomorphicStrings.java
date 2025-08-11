// Last updated: 8/11/2025, 12:49:53 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            if (mapS[s.charAt(i)] != mapT[t.charAt(i)]) return false;  
            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
            //logic- if arr[index] != arr2[index] => false else do i+1
        }
        return true;
    }
}
