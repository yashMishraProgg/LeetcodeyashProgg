// Last updated: 9/4/2025, 1:07:04 PM
class Solution {
    public int findClosest(int x, int y, int z) {
       
       //just calculate the diff and return the person closer to the target

       int diffX = Math.abs(x-z);
       int diffY = Math.abs(y-z);

       if(diffX  < diffY){
        return 1;
       } else if(diffY < diffX){
        return 2; 
       } else {
        return 0;
       }
    }
}