// Last updated: 8/23/2025, 8:32:32 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //here we use fast and slow pointer method
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next!= null){
            fast = fast.next.next;  //2by2forward
            slow = slow.next;       // 1by1forward

            if(fast == slow){
                return true;        //they've met (cycle confirmed)
            }
        }

        return false;
    }
}