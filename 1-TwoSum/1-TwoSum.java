// Last updated: 8/11/2026, 4:04:17 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
      for(int i =0;i<nums.length - 1;i++){
        for(int j=i+1;j<nums.length ;j++){
            if (nums[i]+nums[j]==target){
                return new int[] {i,j};
            }
        }
    } 
    return new int[] {};
    }
}