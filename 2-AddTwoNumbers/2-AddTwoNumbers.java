// Last updated: 10/3/2025, 11:41:32 PM
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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode head = dummy;
        int total = 0;
        int carryDigit = 0;
        while (l1 != null || l2 != null || carryDigit != 0){
            total = carryDigit;
            if (l1 != null){
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                total += l2.val;
                l2 = l2.next;
            }
            int sumDigit = total % 10;
            carryDigit = total / 10;
            dummy.next = new ListNode(sumDigit);
            dummy = dummy.next;
        }
        return head.next;
    }
}