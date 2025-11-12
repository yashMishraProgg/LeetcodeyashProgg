// Last updated: 11/12/2025, 11:14:05 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        
        //the main logic is its nothing but a question like sorted array to BST
        //convert ll to array - then to bst;

        List<Integer> list =  new ArrayList<>();

        while(head != null){
            list.add(head.val);    //add val in arr
            head = head.next;
        }

        return SortedArrayToBST(list, 0, list.size() -1);
    }

    public TreeNode SortedArrayToBST(List<Integer>list, int left, int right){
        if(left > right){
            return null;
        }    

        //calculate mid
        int mid = left + (right - left)/2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = SortedArrayToBST(list,left,mid - 1);
        root.right = SortedArrayToBST(list,mid+1,right);
    
        return root;
    }
}