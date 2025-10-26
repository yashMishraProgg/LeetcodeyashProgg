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
    public int sumOfLeftLeaves(TreeNode root) {
        return findLeft(root,false);  //cause initially root has no left and child
    }

   public int findLeft(TreeNode root, boolean isLeft){
       if(root == null){
        return 0;
       }

    //check if its left or not
       if(root.left == null && root.right == null){
          return isLeft ? root.val : 0; //if left is true return value;
       }

       //now call for left subtree of rooot
       int a = findLeft(root.left, true); //cause we want left only
       int b = findLeft(root.right, false);

       return a + b;
   }
}