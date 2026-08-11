// Last updated: 8/11/2026, 4:00:49 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]==b[1]?b[0]-a[0]:a[1]-b[1]);
        int c=0;
        int  e=Integer.MIN_VALUE;
        for(int[] movie:intervals){
            if(movie[0]>=e){
                e=movie[1];
            }else{
                c++;
            }
        }
        return c;

    }
}