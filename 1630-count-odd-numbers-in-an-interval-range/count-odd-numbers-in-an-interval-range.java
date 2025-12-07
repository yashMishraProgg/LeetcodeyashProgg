class Solution {
    public int countOdds(int low, int high) {
       //optimized solution
       //so after calculating  we have found that 
       //if atleast one in low and high is odd -> add +1 = no of odds
       //if both are even , dont add one 
       //formula is (low-high)/2 + 1(if both are odd)


      return (high - low) / 2 + ((low % 2 != 0 || high % 2 != 0) ? 1 : 0);
    }
}
