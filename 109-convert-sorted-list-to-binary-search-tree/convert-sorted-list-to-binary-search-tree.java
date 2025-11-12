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
// class Solution {
//     public TreeNode sortedListToBST(ListNode head) {
        
//         //the main logic is its nothing but a question like sorted array to BST
//         //convert ll to array - then to bst;

//         List<Integer> list =  new ArrayList<>();

//         while(head != null){
//             list.add(head.val);    //add val in arr
//             head = head.next;
//         }

//         return SortedArrayToBST(list, 0, list.size() -1);
//     }

//     public TreeNode SortedArrayToBST(List<Integer>list, int left, int right){
//         if(left > right){
//             return null;
//         }    

//         //calculate mid
//         int mid = left + (right - left)/2;

//         TreeNode root = new TreeNode(list.get(mid));

//         root.left = SortedArrayToBST(list,left,mid - 1);
//         root.right = SortedArrayToBST(list,mid+1,right);
    
//         return root;
//     }
// }



//can also be done using left and slow pointer
//using slow and fast pointer we cam calculate the mid of linked list
//then using recursion we can build the bst

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }


        //calculate the middle of linked list using the fast and slow pointer
        ListNode middle = getmiddle(head);

        //we got the root so it will be the root of the linked list

        TreeNode root = new TreeNode(middle.val);

        //now the right and left subtree
        root.right = sortedListToBST(middle.next);

        middle.next =  null;
        
        root.left =sortedListToBST(head);
        return root;
    }

    //calculate middle

    public ListNode getmiddle(ListNode head){
        ListNode fast = head;

        ListNode slow = head;

        ListNode prev = null;

        while(fast != null  && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if(prev != null) prev.next = null;
         
         return slow;
    }
}



