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
    TreeNode prev = null;
    TreeNode head = null;

    public TreeNode increasingBST(TreeNode root) {
        
      
        if (root == null){
            return null;
        }

        increasingBST(root.left);
        //we dont want the left side 
        if(prev != null){
            root.left = null;
            prev.right = root; 
        }

        //take the head as root
        if(head == null){
            head = root;
        }
        prev = root;

        increasingBST(root.right);
        return head;
    }
}