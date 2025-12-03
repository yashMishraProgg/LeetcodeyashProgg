// Last updated: 12/3/2025, 10:28:26 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13 
14        while(root != null){
15              //if val < root - LCA lies on left
16            if(p.val < root.val && q.val < root.val){
17              return   lowestCommonAncestor( root.left,p,q);
18              //else LCA lies on right
19            }else if(p.val > root.val && q.val > root.val){
20                return lowestCommonAncestor(root.right,p,q);
21            }else{
22                return root;     // if one is on left and one is on right - current node is LCA(splits)
23            }
24        }
25         return null;
26    }
27}