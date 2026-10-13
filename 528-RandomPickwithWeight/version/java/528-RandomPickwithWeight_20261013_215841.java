// Last updated: 10/13/2026, 9:58:41 PM
1
2class Solution {
3    int[] prefix;
4    int total;
5    Random rand = new Random();
6
7    public Solution(int[] w) {
8        prefix = new int[w.length];
9        total = 0;
10
11        for (int i = 0; i < w.length; i++) {
12            total += w[i];
13            prefix[i] = total;
14        }
15    }
16
17    public int pickIndex() {
18        int target = rand.nextInt(total) + 1;
19
20        int left = 0;
21        int right = prefix.length - 1;
22
23        while (left < right) {
24            int mid = left + (right - left) / 2;
25
26            if (prefix[mid] >= target) {
27                right = mid;
28            } else {
29                left = mid + 1;
30            }
31        }
32
33        return left;
34    }
35}
36
37/**
38 * Your Solution object will be instantiated and called as such:
39 * Solution obj = new Solution(w);
40 * int param_1 = obj.pickIndex();
41 */