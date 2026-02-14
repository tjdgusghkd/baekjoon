class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int maxNum = sides[0];
        int sideSum = sides[1] + sides[2];
        int i = 0;
        while(i < 3){
            if(maxNum < sides[1]){
                maxNum = sides[1];
                sideSum = sides[0] + sides[2];
            } else if(maxNum < sides[2]){
                maxNum = sides[2];
                sideSum = sides[0] + sides[1];
            }
            i++;
        }
        if(maxNum < sideSum){
            answer = 1;
        }
        return answer;
    }
}