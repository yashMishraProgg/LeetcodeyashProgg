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
    public List<Double> averageOfLevels(TreeNode root) {
        //Same as breadth first search
        //change is just , instead of storing the levels , calculate the average
        List<Double> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        //make a queue
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        
        while(!queue.isEmpty()){
          
          int LevelSize = queue.size();

          double Averagelevel = 0;

          for(int i = 0;i < LevelSize; i++){

            TreeNode currentNode = queue.poll();

            Averagelevel += currentNode.val;

            //store the right child
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }

             if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
          }
         
         //calculate Average
         Averagelevel = Averagelevel / LevelSize;
         result.add(Averagelevel);
        }
        return result;
    }
}