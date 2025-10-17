// Last updated: 10/17/2025, 8:39:13 PM
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
    public void flatten(TreeNode root) {
        //0(n) approach => traverse - store - linkedlist
        //0(1) => Hera Pheri Method

       TreeNode current  =  root;

       while(current != null){
         
        if(current.left != null){
            
            TreeNode temp  = current.left;

            while(temp.right != null) {
//traverse till right become null
            temp  = temp.right;
            }
            temp.right = current.right;
            current.right = current.left;
            current.left = null;
        }
        current = current.right;
       }
    }
}