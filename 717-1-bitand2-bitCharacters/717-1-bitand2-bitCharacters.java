// Last updated: 11/18/2025, 10:07:04 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        //so approach is simple
        // 0 -- is a one bit character 
        // 1 -- it can either be a 11 or 10(2bit)
        //logic is , if we land index on last - true
        // if we skip the last - false
      
       

        int i= 0;

        int n = bits.length;

        while( i < n - 1){
             //if 1 bit - index += 2
            if(bits[i] == 1){
                i += 2;
                  //cause if 0 bit , index++
            }else{
                i += 1;
            }
        }
        
        //if  the index end at last bit
       return i == n - 1;

    }
}