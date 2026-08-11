// Last updated: 8/11/2026, 4:02:46 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust for 1-based indexing

            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);

            result.append(ch);

            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}