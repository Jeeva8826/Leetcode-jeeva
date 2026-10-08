// Last updated: 10/8/2026, 10:09:56 AM
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        Map<Integer, Integer> points = new HashMap<>();
4
5        for (int num : nums) {
6            points.put(num, points.getOrDefault(num, 0) + num);
7        }
8
9        int maxValue = Arrays.stream(nums).max().getAsInt();
10        int[] dp = new int[maxValue + 1];
11        dp[0] = 0;
12        dp[1] = points.getOrDefault(1, 0);
13        for (int i = 2; i < dp.length; i++) {
14            dp[i] = Math.max(dp[i - 2] + points.getOrDefault(i, 0), dp[i - 1]);
15        }
16
17        return dp[maxValue];
18    }
19}