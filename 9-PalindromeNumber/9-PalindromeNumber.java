// Last updated: 8/11/2026, 4:04:11 PM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(temp==rev){
            return true;
        }else{
            return false;
        }
    }
}