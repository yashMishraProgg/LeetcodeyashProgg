// Last updated: 12/2/2025, 10:15:46 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode oddEvenList(ListNode head) {
13        //logic is pretty easy
14        //even is at last so we track if even or after even becomes we null stop
15        
16        if(head == null){
17            return head;
18        }
19
20        ListNode curr = head;   //it will track the odd
21        ListNode even = curr.next;  //it will track even cause even comes last
22
23        //to attach even at last
24        ListNode evenHead = even;
25
26        while(even != null && even.next != null){
27            curr.next = curr.next.next; //1->3->5
28            even.next = even.next.next; //2->4
29
30            //move to next
31            curr = curr.next;
32            even = even.next;
33        }
34
35        //if even becomes null
36        //attach evenHead to odd
37        curr.next = evenHead;
38        return head;
39    }
40}