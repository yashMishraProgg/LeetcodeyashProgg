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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //simple reverse logic

        if(head == null || left == right){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        //keepn the prev pointer just before the left
        for(int i =0;i<left-1;i++){
            prev = prev.next;
        }


        //using 2 more points to keep a track of curr ,next and reversed part
        ListNode curr = prev.next;
        ListNode nextNode = null;
        ListNode reversed = null;

        //loop till left-right+1 times till it get reversed as mentioned

        for(int i =0;i <= right-left ;i++){

            nextNode = curr.next;

            curr.next = reversed;//reversing here
            reversed = curr;
            curr = nextNode;
        }

        //now list becomes , reversed = 4, current = 5
        //4->3->2
        //1 - (reversed part) - 5
        prev.next.next = curr ; //connect 2 to 5 so list becomes  4->3->2->5
        //connect 1 to 4
        prev.next = reversed;
        
        return dummy.next;
    }
}