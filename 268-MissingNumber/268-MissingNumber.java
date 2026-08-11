// Last updated: 8/11/2026, 4:01:23 PM
/*
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int expectedsum= n * ( n + 1 ) / 2;
        int actualsum=0;

        for(int num:nums){
           
            actualsum+=nums;
        }
        return expectedsum-actualsum;
    }
}
*/
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}