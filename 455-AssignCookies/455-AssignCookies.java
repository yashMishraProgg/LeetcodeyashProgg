// Last updated: 11/3/2025, 11:51:47 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //so assign cookie to the least greedy child first
        Arrays.sort(g);
        Arrays.sort(s);

        int i= 0; //for children
        int j= 0; // for cookie

        while(i < g.length && j < s.length){
            //if cookie size >= gree of children give the cookie
            if(s[j] >= g[i]){
                i++; //give to the children
            }
            j++; //
        }
        return i;
    }
}