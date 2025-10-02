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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        //check the root node 
        if(p == null && q == null){  //there is not root
            return true;
        }

        if((p == null && q!= null) || p!=null && q == null){ //one has root and other has not so false
            return false;
        }

        if(p.val != q.val){ //roots are not equal
           return false;
        }
        //check left and right
        boolean left = isSameTree(p.left, q.left);

        boolean right = isSameTree(p.right, q.right);

        return left && right;

    }
}