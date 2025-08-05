// Last updated: 8/5/2025, 7:45:38 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(visited.contains(nums[i])){
                return true;
            }else{
                visited.add(nums[i]);
            }
        }
        return false;
    }
}