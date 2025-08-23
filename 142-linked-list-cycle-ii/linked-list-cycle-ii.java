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
    public ListNode detectCycle(ListNode head) {
        //first find the length of the cycle
        ListNode slow = head;
        ListNode fast = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // cycle detected → count cycle length
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != fast);
                break;
            }
        }

        if (length == 0) {
            return null; // no cycle
        }

        //logic is basically if s moves ltimes after length of cycle
        //then it covers (l-s) and remaining points is k
        //so if f and s starts from there l - (l-k) = k
        //if s and f starts k times they'll meet at the start of the cycle

        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {
            f = f.next;  
            s = s.next;
        }

        return f; //cycle start point
    }
}
