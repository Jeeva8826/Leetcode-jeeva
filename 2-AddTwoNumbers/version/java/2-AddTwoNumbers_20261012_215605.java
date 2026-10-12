// Last updated: 10/12/2026, 9:56:05 PM
1
2class Solution {
3    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
4        ListNode l3 = new ListNode(0);
5        ListNode dummy = l3;
6        int carry = 0;
7        int res;
8
9        while (l1 != null || l2 != null) {
10            int sum = carry;
11
12            if (l1 != null) {
13                sum += l1.val;
14                l1 = l1.next;
15            }
16
17            if (l2 != null) {
18                sum += l2.val;
19                l2 = l2.next;
20            }
21
22            res = sum % 10;
23            carry = sum / 10;
24
25            l3.next = new ListNode(res);
26            l3 = l3.next;
27        }
28
29        if (carry != 0) {
30            l3.next = new ListNode(carry);
31        }
32
33        return dummy.next;
34    }
35}
36