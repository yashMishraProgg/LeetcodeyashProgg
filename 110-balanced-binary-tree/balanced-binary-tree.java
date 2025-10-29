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
    public boolean isBalanced(TreeNode root) {
        //so basically a balanced tree => height(left) - height(right) <=1

        if(root == null){
            return true;
        }

        return height(root) != -1;
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftTree = height(node.left);

        if(leftTree == -1){
            return -1;
        }        
        
        int rightTree = height(node.right);

         if(rightTree == -1){
           return -1;
        }   

        if(leftTree - rightTree < -1 || leftTree - rightTree > 1){
            return -1;
        }

        //calculate height
        return Math.max(leftTree, rightTree)  + 1;
        
    }
}