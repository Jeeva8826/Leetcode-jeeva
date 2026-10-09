// Last updated: 10/9/2026, 10:09:25 AM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int maxWealth = 0;
4
5        for (int i = 0; i < accounts.length; i++) {
6            int currentWealth = 0;
7
8            for (int j = 0; j < accounts[i].length; j++) {
9                currentWealth += accounts[i][j];
10            }
11
12            if (currentWealth > maxWealth) {
13                maxWealth = currentWealth;
14            }
15        }
16
17        return maxWealth;
18    }
19}