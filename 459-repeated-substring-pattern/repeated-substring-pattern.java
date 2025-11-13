class Solution {
    public boolean repeatedSubstringPattern(String s) {
       
       //creating new string
       String str = s + s;
       
       return str.substring(1,str.length() - 1).contains(s);
      
    }
}



//catch is we create the substring in advance
//and remove its first and last letter to avoid trivial match
//if that advance substring conatains str as repeated  it would be inside this