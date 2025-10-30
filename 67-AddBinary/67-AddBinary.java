// Last updated: 10/30/2025, 10:05:17 PM
class Solution {
    public String addBinary(String a, String b) {
        //basic idea is if sum > 1 -> carry = 1
        //usig stringbuilder for efficiency 
        StringBuilder res  = new StringBuilder();

        int i = a.length() - 1;      // iterate for string a
        int j = b.length() - 1;      //iterate for string b

        int carry = 0;   //intial carry should be zero

        while(i >= 0 || j >= 0) {

          int sum = carry;

          if(i >= 0){
            sum += a.charAt(i--) - '0';    //convert char to int
          }

          if(j >= 0){
            sum += b.charAt(j--) - '0';
          }

          //now carry part
          carry = sum > 1 ? 1 : 0;

          res.append(sum%2);   //add the bit
        }

        if(carry !=  0){    //last carry added as it is
            res.append(carry);
        }
        return res.reverse().toString();
    }
}