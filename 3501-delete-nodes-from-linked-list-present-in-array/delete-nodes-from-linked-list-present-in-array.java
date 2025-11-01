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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        //lets use a hashset for storing num elements

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode curr = dummy;

        //check if the ll contains nums
        
        while(curr.next != null){
            
            //check
            if(set.contains(curr.next.val)){
                //delete the element
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        
        return dummy.next;

    }
}