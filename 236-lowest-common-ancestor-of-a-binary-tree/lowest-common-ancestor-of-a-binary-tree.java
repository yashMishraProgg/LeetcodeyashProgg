/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //basically the catch is 
        //LCA = deepest node in the tree that has both p and q as descendents

        //if the node itself is p and q
        if(root == null ||  root == p || root == q){
            return root; // we got the root as answer
        }

        //search from root for left
        TreeNode left = lowestCommonAncestor(root.left,p,q);

        //same for right
         TreeNode right = lowestCommonAncestor(root.right,p,q);

        //if found both return the node
        if(left != null && right != null){
            return root;    //you are present
        }

        //if one of is null then the other would be the LCA
        if(left != null){
            return left;
        }else{
            return right;
        }
    }
}