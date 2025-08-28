// Last updated: 8/28/2025, 8:41:29 PM
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
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null){
            return;
        }

        //logic is basically reverse the array from mid and 
        //use start and end two pointer to iterate and 
        //print s,e,s,e,s,e

        ListNode mid  = getMid(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;

        //rearrange
        while(hf!=null && hs!=null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf!=null){
            hf.next = null;
        }
    }

    private ListNode getMid(ListNode head){
        ListNode s = head;
        ListNode f  = head;

        while(f!= null && f.next!= null){
            s = s.next;
            f = f.next.next;
        }
        return s; 
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
