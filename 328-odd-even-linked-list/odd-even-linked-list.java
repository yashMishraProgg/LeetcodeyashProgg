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
    public ListNode oddEvenList(ListNode head) {
        //logic is pretty easy
        //even is at last so we track if even or after even becomes we null stop
        
        if(head == null){
            return head;
        }

        ListNode curr = head;   //it will track the odd
        ListNode even = curr.next;  //it will track even cause even comes last

        //to attach even at last
        ListNode evenHead = even;

        while(even != null && even.next != null){
            curr.next = curr.next.next; //1->3->5
            even.next = even.next.next; //2->4

            //move to next
            curr = curr.next;
            even = even.next;
        }

        //if even becomes null
        //attach evenHead to odd
        curr.next = evenHead;
        return head;
    }
}