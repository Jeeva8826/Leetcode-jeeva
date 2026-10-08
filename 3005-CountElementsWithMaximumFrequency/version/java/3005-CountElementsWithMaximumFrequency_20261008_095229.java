// Last updated: 10/8/2026, 9:52:29 AM
1import java.util.*;
2
3class Solution {
4    public int maxFrequencyElements(int[] nums) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        // Count frequency of each element
9        for (int num : nums) {
10            map.put(num, map.getOrDefault(num, 0) + 1);
11        }
12
13        int maxFreq = 0;
14
15        // Find maximum frequency
16        for (int freq : map.values()) {
17            maxFreq = Math.max(maxFreq, freq);
18        }
19
20        int total = 0;
21
22        // Add frequencies equal to maximum frequency
23        for (int freq : map.values()) {
24            if (freq == maxFreq) {
25                total += freq;
26            }
27        }
28
29        return total;
30    }
31}