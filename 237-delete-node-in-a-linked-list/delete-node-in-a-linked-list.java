/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       // 4-2-5-6 - delete 2
       node.val  = node.next.val;      //4-5-  6

       //now connect 5 to 6
       node.next = node.next.next;    //4-5-6
    }
}