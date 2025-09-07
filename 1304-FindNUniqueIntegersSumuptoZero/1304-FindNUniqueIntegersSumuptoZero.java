// Last updated: 9/7/2025, 7:40:37 PM
class Solution {
    public int[] sumZero(int n) {
        //Logic is simple
        //{1,-1, 2, -2, 0} = > sum = 0
        //at i = add a number,  and at j add its -negative
        //if 1 array space lefts add 0 
        int[] result = new int[n];
        int i = 0;
        int j = n-1;
        int start = 1;

        while(i < j){
           result[i] = start;
           result[j] = -start;

           i++;
           j--;
           start ++;
        }

        return result;
    }
}