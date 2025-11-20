// Last updated: 11/20/2025, 11:00:12 PM
class Solution {
    public int reverse(int x) {
        //its simple we have to reverse 
        //just before adding the rev digit - check it should not overflow
        
        int num = Math.abs(x);
        int rev = 0;
        while(num != 0){
            //last digit

            int lastdigit = num % 10;
            
            //check the overflow

            if(rev > (Integer.MAX_VALUE - lastdigit)/10){ //cause we have to add number so first we - and divide by 10 both side cause we have to mutiply it with 10 also
            //its just the opposite of next step thats add and multiply by 10
                return 0;
            }

            //else add 
            rev = rev * 10 + lastdigit;
            num = num/10;  //remove the last digit
        }
      
        return (x < 0) ? -rev : rev;
    }
}