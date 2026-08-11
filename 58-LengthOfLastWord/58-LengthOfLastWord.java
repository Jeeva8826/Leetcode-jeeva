// Last updated: 8/11/2026, 4:03:33 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count =0;

        while(i>=0 &&s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            i--;
            count++;
        }
        return count;
    }
}