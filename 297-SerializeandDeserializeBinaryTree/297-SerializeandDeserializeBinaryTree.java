// Last updated: 10/21/2025, 11:55:52 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Codec {

    // SERIALIZE: Tree → String
    public String serialize(TreeNode root) {
        if (root == null) return "null,";
        return root.val + "," + serialize(root.left) + serialize(root.right);
    }

    // DESERIALIZE: String → Tree
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        java.util.Queue<String> queue = new java.util.LinkedList<>(java.util.Arrays.asList(arr));
        return helper(queue);
    }

    private TreeNode helper(java.util.Queue<String> queue) {
        String val = queue.poll();
        if (val.equals("null") || val.length() == 0) return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper(queue);
        node.right = helper(queue);
        return node;
    }
}
