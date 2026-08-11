// Last updated: 8/11/2026, 4:00:32 PM
class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder temp = new StringBuilder(words[i]);

            ans.append(temp.reverse());

            if (i != words.length - 1)
                ans.append(" ");
        }

        return ans.toString();
    }
}