// Last updated: 10/11/2025, 12:52:02 PM
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //main logic is just 
        //print left to right  -> then right to left
        //zig zag way 
  
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        //here we use the flag
        boolean leftToright = true;

       
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            List<Integer> currentLevel = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();


                
             if(leftToright){
                currentLevel.add(currentNode.val);
             } else{   //when right to left  => first add in front
                currentLevel.add(0,currentNode.val);
             }
          

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            
            //flip the direction
            leftToright = !leftToright; //to print the other way
            result.add(currentLevel);
        }
         
        return result;
    }
}

