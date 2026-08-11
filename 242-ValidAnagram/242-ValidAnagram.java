// Last updated: 8/11/2026, 4:01:35 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqa=new int[26];
        int[] freqb=new int[26];
        for(char c:s.toCharArray()){
            freqa[c-97]++;
        }
        for(char c:t.toCharArray()){
            freqb[c-97]++;
        }
        return Arrays.equals(freqa,freqb);
    }
}