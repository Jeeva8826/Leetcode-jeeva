// Last updated: 10/5/2026, 9:54:18 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left=0;
4        int right= numbers.length- 1;
5
6        while(left<right){
7            int sum=numbers[left]+numbers[right];
8            if(sum == target){
9                return new int[]{left+1,right+1};
10            }
11            else if(sum<target){
12                left++;
13            }else{
14                right--;
15            }
16        }
17        return new int[]{};
18
19    }
20}