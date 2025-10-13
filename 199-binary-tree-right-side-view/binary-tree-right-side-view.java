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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        //creating a queue to store levels
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            // we know that levelsize == queuesize
            int levelSize = queue.size();

            for(int i =0;i < levelSize ;i++){
                
                TreeNode currentNode = queue.poll(); //remove from queue (root first)
                //only add last one
                if(i  == levelSize - 1){
                    result.add(currentNode.val);
                }

                if(currentNode.left != null){
                    queue.offer(currentNode.left);   //add in queue
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right); //add in queue 
                }

            }
        }
         return result;
    }
}