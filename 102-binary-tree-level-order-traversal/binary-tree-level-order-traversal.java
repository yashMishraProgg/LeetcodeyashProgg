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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        //creating a queue to store levels
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            // we know that levelsize == queuesize
            int levelSize = queue.size();

            //currentlevel
            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for(int i =0;i < levelSize ;i++){
                
                TreeNode currentNode = queue.poll(); //remove from queue (root first)

                currentLevel.add(currentNode.val); //add in list

                if(currentNode.left != null){
                    queue.offer(currentNode.left);   //add in queue
                }

                if(currentNode.right != null){
                    queue.offer(currentNode.right); //add in queue 
                }

            }
            result.add(currentLevel);
        }
         return result;
    }
}
