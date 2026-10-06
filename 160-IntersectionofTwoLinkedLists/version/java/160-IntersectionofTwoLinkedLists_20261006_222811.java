// Last updated: 10/6/2026, 10:28:11 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode pA=headA;
15        ListNode pB=headB;
16
17        while(pA!=pB){
18            pA=(pA==null) ? headB : pA.next;
19            pB=(pB==null) ? headA : pB.next;
20        }
21        return pA;
22    }
23}