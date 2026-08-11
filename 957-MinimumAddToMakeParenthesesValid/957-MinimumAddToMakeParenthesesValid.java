// Last updated: 8/11/2026, 3:59:39 PM
class Solution {

    public int minAddToMakeValid(String s) {
        Stack<Character> sc =new Stack<>();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                sc.push(c);
            }else {
                if(sc.isEmpty())
                    cnt++;
                else{
                    sc.pop();
                }
            }
            
        }
        return cnt+sc.size();
    }
}