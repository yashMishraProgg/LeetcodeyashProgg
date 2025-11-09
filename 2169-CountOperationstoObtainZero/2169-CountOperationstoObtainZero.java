// Last updated: 11/9/2025, 11:44:26 PM
class Solution {
    public int countOperations(int num1, int num2) {
        //so the idea is 
        //Using ECD algorithm
        int ans = 0;

        while(num1 != 0 && num2!= 0){
            //count how many times a number can be divided
            ans  = ans + num1/num2;

            //store the remainder
            num1 = num1%num2;  // since num1 has to be bigger

            //swap
            int temp  = num1;
            num1 = num2;
            num2 = temp;
        }
        return ans;
    }
}