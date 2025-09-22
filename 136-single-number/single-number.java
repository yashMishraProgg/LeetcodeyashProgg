class Solution {
    public int singleNumber(int[] nums) {
        //bit manipultaion basically
        //any number XOR with itself => gives 0 , a ^ a = 0
        //any number XOR with 0 gives => itself , a ^ 0 = a

        int index = 0;

        for(int i = 0; i< nums.length; i++){
            index = index^nums[i];
        }
        return index;
    }
}