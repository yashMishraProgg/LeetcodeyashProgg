class Solution {
    //check if not contains zero 
    private boolean check(int num){
        while(num > 0){

            if(num % 10 == 0){
                return false;
            }
            num = num/10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {

        //logic is simple
        //basically check the last digit of n should not be zero
        //if n = 12 so a = 1 , b= 12-1=> 11 
        //so a + b => 12 answer so return a and b 
        
        for(int i = 1; i < n; i++){
          
          int a = i;
          int b = n - a; 

          if(check(a) && check(b)){
            return new int[]{a,b};
          }
        }

        return new int[0]; 
    }
}
