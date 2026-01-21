class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int one = a + b + c;
        int two = one * (a*a  + b*b + c*c);
        int all = two * (a*a*a + b*b*b + c*c*c);
        
        
        if(a == b && b ==c) {
            answer = all;
        } else if(a != b && b != c && a != c) {
            answer = one;
        } else {
            answer = two;
        }
        return answer;
    }
}