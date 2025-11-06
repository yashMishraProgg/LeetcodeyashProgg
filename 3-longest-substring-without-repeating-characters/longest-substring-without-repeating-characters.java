class Solution {
    public int lengthOfLongestSubstring(String s) {
        //so we use a hashset here to put unique element
        //if j is not in set - j++
        //remove and do i++
        int i = 0;
        int j = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while(j < s.length()){
          if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j++)); // increase the pointer
            //calculate max
            max = Math.max(max,set.size());
          }else{
            //if found the same char
            //remove and do i++ , reduce window cause we want non repeating no duplicate
         set.remove(s.charAt(i++));

          }
        }
        return max;
    }
}