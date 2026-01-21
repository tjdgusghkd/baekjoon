class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        boolean test1 = ineq.equals("<") ? true : false;
        boolean test2 = eq.equals("=") ? true : false;
        
        if(test2) {
            if(test1) {
                if(n <= m) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            } else {
                if(n >= m) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            }
        } else {
            if(test1) {
                if(n < m) {
                    answer = 1;
                } else {
                    answer = 0;
                }
            } else {
                if(n > m) {
                    answer = 1;
                } else {
                    answer = 0;
                }  
            }
        }
        
        return answer;
    }
}