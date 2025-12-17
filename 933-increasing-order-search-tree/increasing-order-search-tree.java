class Solution {
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        TreeNode cur = ans;
        inorder(root, cur);
        return ans.right;
    }

    private TreeNode inorder(TreeNode node, TreeNode cur) {
        if (node == null) return cur;
        
        cur = inorder(node.left, cur);
        
        node.left = null;
        cur.right = node;
        cur = node;
        
        return inorder(node.right, cur);
    }
}