// Last updated: 9/12/2025, 7:11:36 PM
class Solution {
    //cause if string contains odd vowels like leetcod =>
    //alice will remove the whole string
    public boolean doesAliceWin(String s) {

     //clear logic is after anlaysis
     //if the string contains a single vowel(1 odd) => Alice going to win 
     //if not => then bob wins (if there is no vowel it contains 0(even))   

      for(char c : s.toCharArray()){
        if(c == 'a' || c == 'e' || c == 'i'|| c =='o' || c == 'u'){
            return true;
        }
      }
       //else
       return false;
    }
}