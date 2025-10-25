/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //so if mid is bad then before will also be bad 
        //else after mid will be bad
        //binaru search
        int left = 1;
        int right = n;

        while(left < right){
            
            int mid = left + (right-left)/2;

            if(!isBadVersion(mid)){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left; //or right
    }
}