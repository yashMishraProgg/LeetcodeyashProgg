// Last updated: 12/17/2025, 9:38:38 PM
1class Solution {
2    public TreeNode increasingBST(TreeNode root) {
3        TreeNode ans = new TreeNode(0);
4        TreeNode cur = ans;
5        inorder(root, cur);
6        return ans.right;
7    }
8
9    private TreeNode inorder(TreeNode node, TreeNode cur) {
10        if (node == null) return cur;
11        
12        cur = inorder(node.left, cur);
13        
14        node.left = null;
15        cur.right = node;
16        cur = node;
17        
18        return inorder(node.right, cur);
19    }
20}