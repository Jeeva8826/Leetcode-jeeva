// Last updated: 8/11/2026, 4:00:47 PM
class Solution {
    public int findMinArrowShots(int[][]intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int c=0;
        long e=Long.MIN_VALUE;
        for(int[] balloons:intervals){
            if(balloons[0]<=e){
                continue;
            }else{
                c++;
                e=balloons[1];
            }
        }
        return c;

    }
}