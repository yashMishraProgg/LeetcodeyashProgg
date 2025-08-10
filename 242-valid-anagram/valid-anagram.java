class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[]count = new int[26];
        
        //asci codes  - logic
        //'a' = 97, 'b' = 98 so
        //a - a = 0
        //b - a = 1 , c-a = 1 so every char will map to a index in array so first we increment it by 1
        //if the same char appears again then it will map again so we decrement it and it becomes 0
        //so at end of string if all index[ele] are 0 then s is a anagram  of t
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        //check
        for(int c: count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
}