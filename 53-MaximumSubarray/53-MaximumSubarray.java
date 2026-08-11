// Last updated: 8/11/2026, 4:03:36 PM
class Solution {
    public int maxSubArray(int[] nums) {

        // Initialize both with the first element
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Traverse the array from index 1
        for (int i = 1; i < nums.length; i++) {

            // Either start a new subarray or continue the old one
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}