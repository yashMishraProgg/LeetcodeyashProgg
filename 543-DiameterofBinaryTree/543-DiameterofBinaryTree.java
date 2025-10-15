// Last updated: 10/15/2025, 7:45:27 PM
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
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        //so we calculate the length first
        //then the diameter  = left + right + 1;
        height(root);
        return diameter - 1;    //cause of no of edges not nodes
    }

    int height(TreeNode node){
        if(node == null){
            return 0;
        }

        //left
        int leftHeight = height(node.left);
        int RightHeight = height(node.right);

        int dia = leftHeight + RightHeight + 1;  
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight , RightHeight ) + 1;
    }
}