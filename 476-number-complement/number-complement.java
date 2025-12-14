class Solution {
    public int findComplement(int num) {
        //this is a  string method
        //first we convert the integer to binary

        String str =Integer.toBinaryString(num);
        String res = "";

        for(int i = 0;i< str.length();i++){
            if(str.charAt(i) == '0'){
                res += '1';
            }else{
                res += '0';
            }
        }
       //now convert the string back to num
       return Integer.parseInt(res,2);   //here is 2 is the base of the binary
    }
}