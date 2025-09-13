// Last updated: 9/13/2025, 7:51:58 PM
class Solution {
    public int maxFreqSum(String s) {

      int maxVowel = 0;

      int maxCons = 0;

      int[] freq = new int[26];

      for(char ch: s.toCharArray()){

        freq[ch - 'a']++; // increase frequency count;

        if("aeiou".indexOf(ch) != -1){
            maxVowel = Math.max(maxVowel , freq[ch - 'a']);
        }else{
            maxCons =  Math.max(maxCons , freq[ch - 'a']);
        }
     }   
      return maxVowel  + maxCons;
    }
}









//simple logic
        //store freq count using arr[ch -'a']
        // find maxvowel and maxconsonant
        //retunr maxvowel + maxconsonant
        