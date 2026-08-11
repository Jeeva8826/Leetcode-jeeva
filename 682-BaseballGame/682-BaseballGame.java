// Last updated: 8/11/2026, 4:00:15 PM
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> Stack=new Stack<>();

        for(String op:ops){
            if(op.equals("+")){
                int top=Stack.pop();
                int newScore=top+Stack.peek();
                Stack.push(top);
                Stack.push(newScore);
            }
            else if(op.equals("D")){
                Stack.push(2*Stack.peek());
            }
            else if(op.equals("C")){
                Stack.pop();
            }else{
                Stack.push(Integer.parseInt(op));
            }

        }
        int sum=0;
        for(int num:Stack){
            sum+=num;
        }
        return sum;
    }
}