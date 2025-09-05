// Last updated: 9/5/2025, 10:20:30 PM
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        
        //basically we minimize the formula to 
        //val = num1-t*num2 = express in sum of t powers of 2
        //so the operations will be performed t times to get to 0
       
        int t = 1;

        while(true){
        
        long val = num1 -(long) num2 * t;
         
        if(val < t){ // or val = 0 => impossible to calculate
           return -1;
        }

        if(t >= Long.bitCount(val)){
            return t;
        }

        t++; 
        
       }
    }
}