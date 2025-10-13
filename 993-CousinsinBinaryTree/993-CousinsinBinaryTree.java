// Last updated: 10/13/2025, 7:55:55 PM
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
    public boolean isCousins(TreeNode root, int x, int y) {
        //They are only be cousins =>
        //1. There level should be same (level of x == level of y)
        //2. They are not siblings 

        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
            (level(root, xx, 0) == level(root, yy, 0)) && (!isSiblings(root, xx, yy))
        );
    }

    //Find the  node
    TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }

        if (node.val == x) {
            return node;
        }
        //search on left
        TreeNode n = findNode(node.left, x);

        if (n != null) {
            return n;
        }

        return findNode(node.right, x);
    }

    //find the levels
    int level(TreeNode node, TreeNode x, int iniValue) {
        if (node == null) {
            return 0;   //intial level would be 0
        }

        if (node == x) {
            return iniValue;
        }
        //calculate for left
        int l = level(node.left, x, iniValue + 1);

        if (l != 0) {
            return l;
        }
        //calculate for right
        return level(node.right, x, iniValue + 1);
    }

    //Check the siblings are equal or not
    boolean isSiblings(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) {
            return false;
        }

        return (
            (node.left == x && node.right == y) ||
            (node.left == y && node.right == x) ||
            isSiblings(node.left, x, y) ||
            isSiblings(node.right, x, y)
        );
    }
}
