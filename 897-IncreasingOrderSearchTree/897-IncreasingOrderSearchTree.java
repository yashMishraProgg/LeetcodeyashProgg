// Last updated: 12/17/2025, 9:23:56 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    TreeNode prev = null;
18    TreeNode head = null;
19
20    public TreeNode increasingBST(TreeNode root) {
21        
22      
23        if (root == null){
24            return null;
25        }
26
27        increasingBST(root.left);
28        //we dont want the left side 
29        if(prev != null){
30            root.left = null;
31            prev.right = root; 
32        }
33
34        //take the head as root
35        if(head == null){
36            head = root;
37        }
38        prev = root;
39
40        increasingBST(root.right);
41        return head;
42    }
43}