// Last updated: 8/11/2026, 4:02:02 PM
class Solution {
    public boolean isHappy(int n) {

        while (n != 1) {

            int sumdigit = 0;

            while (n != 0) {
                int temp = n % 10;
                sumdigit += temp * temp;
                n /= 10;
            }

            n = sumdigit;

            // To avoid infinite loop
            if (n == 4)
                return false;
        }

        return true;
    }
}