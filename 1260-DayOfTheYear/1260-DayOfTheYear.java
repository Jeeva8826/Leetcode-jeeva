// Last updated: 8/11/2026, 3:59:25 PM
class Solution {
    public int dayOfYear(String date) {

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        // Leap year check
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if (month > 2) {
                total++;
            }
        }

        return total;
    }
}