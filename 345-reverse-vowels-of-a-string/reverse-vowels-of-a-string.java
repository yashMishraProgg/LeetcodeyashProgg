class Solution {
    public String reverseVowels(String s) {
        //using two pointer method
        //first we convert the string to charArray

        String vowels = "aeiouAEIOU"; 

        //we use indexOf() - if vowels not found in char - return -1

        char[] chars = s.toCharArray(); 

        int l  = 0 , r = s.length() -1;


        while(l < r){
            
            //-1 means vowel not found
            while(l < r && vowels.indexOf(chars[l])  == -1) l++;

            while(l < r && vowels.indexOf(chars[r])  == -1) r--;


            //if found the vowel

           char temp = chars[l];

            chars[l] = chars[r];

            chars[r] = temp;

            l++;
            r--;

        }
        
        return new String(chars);
    
    }
}