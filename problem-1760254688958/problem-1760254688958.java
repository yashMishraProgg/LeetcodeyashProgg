// Last updated: 10/12/2025, 1:08:08 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
      
      //using the link list approach

      if(root == null){
        return null;
      }

      Node leftMost =  root;

      while(leftMost.left != null){
        
        Node current = leftMost;
        
        //iterate current
        while(current != null){

         current.left.next = current.right;


         if(current.next != null){
            current.right.next = current.next.left;
        }

         current = current.next; //move next in the same level

        }
        //move down in the tree;
        leftMost  = leftMost.left;
    }

    return root;
    
}           
    
}