class Solution {

    public int removeDuplicates(int[] nums) {
        //if found  a unique increase i 
        //and return i + 1 (cause its  0 indexed)
        int n = nums.length;

        int i = 0;
            for(int j = 1; j< n; j++){
               if(nums[i] != nums[j]){
                i++; //found a unique element
                nums[i] = nums[j];
               }
            }
        return i + 1;
    }
}