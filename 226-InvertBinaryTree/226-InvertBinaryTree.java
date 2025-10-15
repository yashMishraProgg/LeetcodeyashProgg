// Last updated: 10/15/2025, 8:10:12 PM
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
    public TreeNode invertTree(TreeNode root) {
        //just making left = right and the same easy
        if(root == null){
            return null;
        }

        TreeNode right = invertTree(root.right);
        TreeNode left  = invertTree(root.left);

        //swap
        root.left = right;
        root.right = left;

        return root;
    }
}