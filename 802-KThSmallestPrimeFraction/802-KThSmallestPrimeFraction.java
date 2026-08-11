// Last updated: 8/11/2026, 4:00:02 PM
import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(a[0], b[0])
        );

        int n = arr.length;

        // Store all fractions in the heap
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double value = (double) arr[i] / arr[j];
                pq.offer(new double[]{value, arr[i], arr[j]});
            }
        }

        // Remove k-1 smallest fractions
        while (k > 1) {
            pq.poll();
            k--;
        }

        double[] ans = pq.poll();

        return new int[]{(int) ans[1], (int) ans[2]};
    }
}