// Last updated: 8/11/2026, 3:59:41 PM
import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int card : deck) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        int gcd = 0;

        // Find GCD of all frequencies
        for (int freq : map.values()) {
            gcd = findGCD(gcd, freq);
        }

        return gcd > 1;
    }

    // Euclidean Algorithm
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}