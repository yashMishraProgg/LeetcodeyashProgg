class Solution {
    //cause if string contains odd vowels like leetcod => 3 vowels
    //alice will remove the whole string
    public boolean doesAliceWin(String s) {

     //clear logic is after anlaysis
     //if the string contains atleast a single vowel(1 odd) => Alice going to win 
     //if not => then bob wins (if there is no vowel it contains 0(even))   
       if (s.indexOf('a') != -1 || s.indexOf('e') != -1 || s.indexOf('i') != -1 || s.indexOf('o') != -1 || s.indexOf('u') != -1) {
            return true;
        }
        return false;
    }
}
//indexOf() = -1(if not found)

//2 ------------way
//alternate 
//  for(char c : s.toCharArray()){
//         if(c == 'a' || c == 'e' || c == 'i'|| c =='o' || c == 'u'){
//             return true;
//         }
//       }
//        //else
//        return false;

//3 ----------------------way
//you can also use a hashset
//create a set of vowels
//if(set.contains(vowels)){
//     return true; else false;
// }

//4th -----------way
//string vowels = "aeiou";
// for(char c: toCharArray()){
//     if(vowels.indexof(c) !=-1){
//         return true ; else false;
//     }
// }