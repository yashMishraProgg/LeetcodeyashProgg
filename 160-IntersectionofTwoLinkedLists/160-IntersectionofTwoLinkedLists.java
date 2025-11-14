// Last updated: 11/14/2025, 10:58:34 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //main idea behind this is make them walk equal distance 
        // a + b
        //if there distances are equal theyll meet
        if(headA == null || headB == null){
            return null;
        }

        //well use two pointers 

        ListNode p1 = headA; 

        ListNode p2 = headB; 

        
        
        while(p1 != p2 ){

            p1 = p1 == null ? headB : p1.next;

            p2 = p2 == null ? headA : p2.next;

        
        }
         
         return p1; 
    }
}