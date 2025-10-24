// Last updated: 10/24/2025, 11:10:09 PM
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
    int ans = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        TreeMax(root);
        return ans;
    }

    public int TreeMax(TreeNode node){
        if(node == null){
            return 0;
        }

        //Calculate left max and right max

        int left = TreeMax(node.left);
        int right = TreeMax(node.right);

        //what if the value is negative
        left = Math.max(0,left);
        right = Math.max(0,right);

        int sumOfPath = left + right + node.val;
        
        ans = Math.max(ans,sumOfPath);

        return Math.max(left,right) + node.val;  //this will calculate
    }
}