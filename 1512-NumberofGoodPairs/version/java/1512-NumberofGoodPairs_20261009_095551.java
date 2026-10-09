// Last updated: 10/9/2026, 9:55:51 AM
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int g=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if(nums[i]==nums[j] ){
7                    g++;
8                }
9            }
10        }
11        return g;
12    }
13}