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
 
        while(root != null){
              //if val < root - LCA lies on left
            if(p.val < root.val && q.val < root.val){
              return   lowestCommonAncestor( root.left,p,q);
              //else LCA lies on right
            }else if(p.val > root.val && q.val > root.val){
                return lowestCommonAncestor(root.right,p,q);
            }else{
                return root;     // if one is on left and one is on right - current node is LCA(splits)
            }
        }
         return null;
    }
}