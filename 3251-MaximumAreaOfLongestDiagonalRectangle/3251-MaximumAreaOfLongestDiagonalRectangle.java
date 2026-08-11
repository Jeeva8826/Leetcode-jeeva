// Last updated: 8/11/2026, 3:58:49 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea=0;
        int maxDiagonal=0;
        for(int[] rectangle:dimensions){
            int lenght=rectangle[0];
            int width=rectangle[1];

            int Diagonal= lenght*lenght+width*width;
            int Area= lenght*width;

            if(Diagonal>maxDiagonal){
                maxDiagonal=Diagonal;
                maxArea=Area;
            }else if(maxDiagonal==Diagonal && Area>maxArea){
                maxArea=Area;
            }
        }
        return maxArea;
    }
}