// Last updated: 11/16/2025, 11:01:20 PM
class Solution {
    public String addStrings(String num1, String num2) {
        
        //simple logic is using carrying method 
        //using 2 pointers

        StringBuilder st = new StringBuilder();

        int i  = num1.length() -1;
        int j  = num2.length() -1;

        //carry
        int carry=  0;

        while(i >= 0 || j>=0 || carry > 0 ){
            //start from last and convert integer

            int  firstDigit = (i >=0) ? num1.charAt(i--) - '0': 0;

            int  secondDigit = (j >=0) ? num2.charAt(j--) - '0': 0;

            int sum = firstDigit + secondDigit + carry;

            //append the last digit first;
            st.append(sum % 10); //if sum is 13 then it appends 3

            //for carry
            carry  = sum /10;   // 13/10 - 1 carry


        }

        //reverse the answer to get the actual sum
        return st.reverse().toString();


    }
}