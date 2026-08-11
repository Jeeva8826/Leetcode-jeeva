// Last updated: 8/11/2026, 4:00:10 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack=new Stack<>();
        int[] arr=new int[temp.length];
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
                arr[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        return arr;
    }
}