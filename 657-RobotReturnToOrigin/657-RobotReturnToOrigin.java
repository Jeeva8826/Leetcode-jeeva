// Last updated: 8/11/2026, 4:00:18 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;

        for(char move:moves.toCharArray()){
            switch(move){
                case 'U':
                y++;
                break;
            }
            switch(move){
                case 'D':
                y--;
                break;
            }
            switch(move){
                case 'R':
                x++;
                break;
            }
            switch(move){
                case 'L':
                x--;
                break;
            }
        }
        return x==0 && y==0;
     
    }
}