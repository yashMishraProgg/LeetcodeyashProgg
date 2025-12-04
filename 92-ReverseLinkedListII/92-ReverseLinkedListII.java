// Last updated: 12/4/2025, 11:39:41 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        //simple reverse logic
14
15        if(head == null || left == right){
16            return head;
17        }
18
19        ListNode dummy = new ListNode(0);
20        dummy.next = head;
21
22        ListNode prev = dummy;
23
24        //keepn the prev pointer just before the left
25        for(int i =0;i<left-1;i++){
26            prev = prev.next;
27        }
28
29
30        //using 2 more points to keep a track of curr ,next and reversed part
31        ListNode curr = prev.next;
32        ListNode nextNode = null;
33        ListNode reversed = null;
34
35        //loop till left-right+1 times till it get reversed as mentioned
36
37        for(int i =0;i <= right-left ;i++){
38
39            nextNode = curr.next;
40
41            curr.next = reversed;//reversing here
42            reversed = curr;
43            curr = nextNode;
44        }
45
46        //now list becomes , reversed = 4, current = 5
47        //4->3->2
48        //1 - (reversed part) - 5
49        prev.next.next = curr ; //connect 2 to 5 so list becomes  4->3->2->5
50        //connect 1 to 4
51        prev.next = reversed;
52        
53        return dummy.next;
54    }
55}