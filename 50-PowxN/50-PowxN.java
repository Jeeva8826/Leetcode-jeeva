// Last updated: 8/11/2026, 4:03:45 PM
class Solution {
    public double myPow(double x, int n) {

        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1;

        while (power > 0) {

            // If power is odd
            if (power % 2 == 1) {
                result *= x;
            }

            x *= x;      // Square x
            power /= 2;  // Divide power by 2
        }

        return result;
    }
}