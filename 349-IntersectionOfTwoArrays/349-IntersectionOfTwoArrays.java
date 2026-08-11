// Last updated: 8/11/2026, 4:01:09 PM
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store nums1 elements
        for (int num : nums1) {
            set.add(num);
        }

        // Find common elements
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Convert HashSet to array
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}