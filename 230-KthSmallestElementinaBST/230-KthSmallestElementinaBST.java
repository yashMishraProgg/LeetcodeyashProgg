// Last updated: 10/20/2025, 12:03:13 PM
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
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        //so its an inorder traversal problem
        //inoreder => Sorted array
        //So each time you visit a node , count ++ and if count == k (return node );
       return ReturnkthNode(root,k).val;
    }

    public TreeNode ReturnkthNode(TreeNode root,int k){
         if(root == null){
            return null;
        }

        TreeNode left = ReturnkthNode(root.left,k);

        if(left != null){
            return left;
        }

        count++;

        if(count == k){
            return root;
        }

        return ReturnkthNode(root.right,k);
    }
}