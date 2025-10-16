// Last updated: 10/16/2025, 6:42:19 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        //SIMPLE
        //as we use bianary search if the array is sorted
        //for root.left = start to  mid-1
        //for root.rigth = mid + 1 to end;
        int n = nums.length;
        return SortedToBST(nums,0, n-1); 
    }

    public TreeNode SortedToBST(int[] nums, int start, int end){
        if(start > end){              //base
            return null;
        }

        //calculate mid
        int mid = start + (end-start) /2 ;

        TreeNode root = new TreeNode(nums[mid]);    //mid will be the root node;

        root.left = SortedToBST(nums, start, mid - 1);
        root.right = SortedToBST(nums,mid + 1, end);

        return root;
    }
}