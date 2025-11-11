// Last updated: 11/11/2025, 11:28:26 PM
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
    TreeNode first, second, prev; //pointers
    public void recoverTree(TreeNode root) {
        //so its a inorder type question
        //so [1,3,2] -> inorder -> [1,2,3] 
        //so here prev = 3 and root = 2 , so if prev > root => swap it
      
        first = second = prev = null;

        inorder(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;   
    }

    //inorder =>  ascending order
    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        //check for prev
        if (prev != null && prev.val > root.val) {
            //if found wrong node
            if (first == null){
                first = prev;
            }
            second = root;   // ← move outside of the if (first == null)
        }

        prev = root; 
        inorder(root.right);
    }
}
