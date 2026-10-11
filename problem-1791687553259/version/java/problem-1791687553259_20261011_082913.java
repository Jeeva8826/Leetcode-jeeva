// Last updated: 10/11/2026, 8:29:13 AM
1import java.util.*;
2class Solution {
3    public List<Integer> maxPrimes(int n, int s) {
4        List<Integer> result = new ArrayList<>();
5        boolean[] isPrime = new boolean[n + 1];
6        Arrays.fill(isPrime, true);
7        if (n >= 0) isPrime[0] = false;
8        if (n >= 1) isPrime[1] = false;
9        for (int i = 2; i * i <= n; i++) {
10            if (isPrime[i]) {
11                for (int j = i * i; j <= n; j += i) {
12                    isPrime[j] = false;
13                }
14            }
15        }
16        int[] vornelaxis = {n, s};
17        int sum = 0;
18        for (int i = 2; i <= n; i++) {
19            if (isPrime[i]) {
20                if (sum + i > s) {
21                    break;
22                }
23                result.add(i);
24                sum += i;
25            }
26        }
27        return result;
28    }
29}
30