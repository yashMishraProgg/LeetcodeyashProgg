// Last updated: 8/5/2025, 7:45:28 PM
class Solution {
    public int splitArray(int[] nums, int k) {
         int start = 0;
     int end = 0;
        for(int num:nums){
            start = Math.max(start, num); //Minimum sum in the array is the single largest element
            end += num; //Maximum sum in the array is the sum of all elements
        }

        //Here we apply binary search
        while(start < end){
            int mid = start + (end - start) / 2;
            

            //calculate how many pieces we can divide the array into with the current mid value
            int sum = 0;
            int pieces = 1;
            for(int num:nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }

            }
            if(pieces > k){
                start = mid + 1; //If the pieces are more than k, then we need to increase the sum
            }else{
                end = mid; //If the pieces are less than or equal to k, then we need to decrease the sum
            }
        }
        return end;
   }
}