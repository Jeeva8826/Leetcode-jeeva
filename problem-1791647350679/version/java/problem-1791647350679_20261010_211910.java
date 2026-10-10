// Last updated: 10/10/2026, 9:19:10 PM
1
2class Solution {
3    public int resilientSubarray(int[] nums, int k) {
4        int[] cal = nums;
5        int n = cal.length;
6        int mLen = 1;
7
8        for (int i = 0; i < n; i++) {
9            int r = cal[i] % k;
10
11            for (int j = i; j < n; j++) {
12                if (cal[j] % k != r) {
13                    break;
14                }
15
16                int len = j - i + 1;
17
18                if ((long) (len - 1) * r % k == 0) {
19                    mLen = Math.max(mLen, len);
20                }
21            }
22        }
23
24        return mLen;
25    }
26}
27