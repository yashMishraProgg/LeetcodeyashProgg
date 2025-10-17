// Last updated: 10/17/2025, 9:26:19 PM
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
    public boolean isValidBST(TreeNode root) {
        //so in a binary tree 
        // in leftree of root val<root and on righttree val>root
        //nodes have limit can go as low as node but if root is high then
        //the limit is till high

    return CheckBST(root,null,null); //initial low and high value are null cause this is root and no constraints are there
    }

    boolean CheckBST(TreeNode node, Integer low, Integer high){
        if(node  == null){
            return true ; 
        }

        if(low != null && node.val <= low){   //cause value not be less than low
            return false;   //lets say node is 4 (phii,6) cause 6 is root
      //                                      /\
     //                                      2  5 (4,6) so low limit is 4 so, node.val(5) cannot be less than 4
        }

        if(high != null && node.val >= high){
            return false;
        }

        boolean leftTree = CheckBST(node.left, low, node.val);
        boolean rightTree = CheckBST(node.right,node.val, high);

        return leftTree && rightTree;
    }
}