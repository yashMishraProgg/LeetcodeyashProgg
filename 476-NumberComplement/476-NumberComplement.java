// Last updated: 12/14/2025, 10:34:20 PM
1class Solution {
2    public int findComplement(int num) {
3        //this is a  string method
4        //first we convert the integer to binary
5
6        String str =Integer.toBinaryString(num);
7        String res = "";
8
9        for(int i = 0;i< str.length();i++){
10            if(str.charAt(i) == '0'){
11                res += '1';
12            }else{
13                res += '0';
14            }
15        }
16       //now convert the string back to num
17       return Integer.parseInt(res,2);   //here is 2 is the base of the binary
18    }
19}