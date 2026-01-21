class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ex1 = 2 * a * b;
        int ex2 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        
        if(ex1 > ex2) {
            answer = ex1;
        } else {
            answer = ex2;
        }
        return answer;
    }
}