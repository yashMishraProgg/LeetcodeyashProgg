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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // We know that root can be found in preOrder
        // and left and right from inOrder

        if(preorder.length == 0){
            return null; // Base case: if no elements, return null
        }

        // root is the first node in preorder
        int root = preorder[0];
        int index = 0;

        // now we have to find the left part and right part from inorder
        // so if index or root is found in inorder
        // then its left part == (1, index+1) in preOrder
        // and its right part == (index+1,end) in preOrder

        for(int i = 0; i < inorder.length; i++){
            // found the root in inorder, and we call it index so we can get its left and right
            if(inorder[i] == root){
                index = i;
                break;
            }
        }

        // create the root node
        TreeNode node = new TreeNode(root);

        // so its left in preorder == (1,index+1)
        node.left = buildTree(
            Arrays.copyOfRange(preorder, 1, index + 1),
            Arrays.copyOfRange(inorder, 0, index)
        );

        // and its right in preorder == (index+1, end)
        node.right = buildTree(
            Arrays.copyOfRange(preorder, index + 1, preorder.length),
            Arrays.copyOfRange(inorder, index + 1, inorder.length)
        );

        return node; 
    }
}
