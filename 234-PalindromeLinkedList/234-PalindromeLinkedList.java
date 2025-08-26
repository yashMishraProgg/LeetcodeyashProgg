// Last updated: 8/26/2025, 10:55:54 PM
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
    public boolean isPalindrome(ListNode head) {
        //logic is basically 
        //get mid -> reverse from mid -> compare values -> if get traversed -> true palindrome else not
         
         ListNode mid= getMid(head);
         ListNode SecondHead = reverseList(mid);
         ListNode reverseHead = SecondHead;

         while(head!= null && SecondHead != null){
            if(head.val != SecondHead.val){
                break;
            }
            head = head.next;
            SecondHead = SecondHead.next;
         }
        reverseList(reverseHead);

        //if head and Secondhead is null -> LL traversed without break
        if(SecondHead == null){
            return true;
        }
        return false;
    }

    private ListNode getMid(ListNode head){
        ListNode f = head;
        ListNode s = head;

        while(f!=null && f.next!= null){
            s = s.next;
            f = f.next.next; 
        }
        return s;
    }

    private ListNode reverseList(ListNode head){ 
        ListNode prev = null;
        ListNode currNode = head;

        while(currNode != null){
          ListNode NextNode = currNode.next; 
          currNode.next = prev;
          prev = currNode;
          currNode =  NextNode;
        }

        return prev; // fix: return new head
    }
}
