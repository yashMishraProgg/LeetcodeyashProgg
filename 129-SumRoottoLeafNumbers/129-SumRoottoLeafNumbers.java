// Last updated: 10/23/2025, 11:24:20 PM
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
    public int sumNumbers(TreeNode root) {
        return calculateSum(root,0);
    }

    public int calculateSum(TreeNode node, int sum){
        if(node == null){
            return 0;
        }

        //calculate sum
        sum = sum*10 + node.val;    //current node value

        //check if its leaf or not
        if(node.left == null && node.right == null){
            return sum;
        }

        //traverse left and right and add both recsum
        return calculateSum(node.left,sum) + calculateSum(node.right,sum);
    }
}