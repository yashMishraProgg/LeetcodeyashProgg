// Last updated: 11/8/2025, 11:19:06 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }
        preorder(root,list);
        return list;
    }
    public void  preorder(TreeNode root,ArrayList<Integer> list){
        if(root == null){
            return;
        }

        preorder(root.left,list);
        preorder(root.right,list);
        list.add(root.val);
    }
}