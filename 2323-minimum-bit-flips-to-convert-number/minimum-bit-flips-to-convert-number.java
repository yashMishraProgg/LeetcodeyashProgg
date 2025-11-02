class Solution {
    public int minBitFlips(int start, int goal) {
        //so the catch is we use xor to know how many bits are changed
        //and count the 1s
        //cause A ^ 0 = A(different 1) and A ^ A = 0(same 0)

        int xor = start ^ goal; //ex 1101 -> 3 bits are changed
        int count = 0;

        while(xor > 0){
            //xor & 1 => checks if the last bit is one 
            count = count + (xor & 1);  

            //remove the last bit
            xor = xor >> 1;
            
        }

        return count;
    }
}