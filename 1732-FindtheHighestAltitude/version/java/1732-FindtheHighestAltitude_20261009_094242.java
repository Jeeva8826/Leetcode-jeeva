// Last updated: 10/9/2026, 9:42:42 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int altitude=0;
4        int highest=0;
5
6        for(int i=0;i<gain.length;i++){
7            altitude=altitude+gain[i];
8
9            if(altitude > highest){
10                highest=altitude;
11            }
12        }
13        return highest;
14    }
15}