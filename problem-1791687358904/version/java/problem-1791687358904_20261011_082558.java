// Last updated: 10/11/2026, 8:25:58 AM
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3        int h = 0,i = 1,j = 1;
4        while (true) {
5            int sum = h+i+j;
6            if(sum==n){
7                return true;
8            }
9            if(sum>n){
10                return false;
11            }
12            h = i;
13            i = j;
14            j=i+h;
15        }
16    }
17}
18