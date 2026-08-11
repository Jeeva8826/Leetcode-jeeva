// Last updated: 8/11/2026, 4:00:44 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {

            if (n % len != 0)
                continue;

            String sub = s.substring(0, len);

            StringBuilder sb = new StringBuilder();

            int repeat = n / len;

            for (int i = 0; i < repeat; i++) {
                sb.append(sub);
            }

            if (sb.toString().equals(s))
                return true;
        }

        return false;
    }
}