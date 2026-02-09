class Solution {
    public int solution(int n) {
        int answer = 2;
        double ex = Math.sqrt(n);
        if(Math.floor(ex) == ex){
            answer = 1;
        }
        return answer;
    }
}