// Last updated: 8/11/2026, 3:59:06 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int st0 = (int) Arrays.stream(students).filter(x -> x == 0).count(); 
        int st1 = students.length - st0; 
        
        for (int x : sandwiches) {
            if (x == 1) { 
                if (st1 > 0) st1--;  
                else return st0+st1; 
            } else { 
                if (st0 > 0) st0--; 
                else return st1+st0; 
            }
        }
        
        return 0; 
    }
}