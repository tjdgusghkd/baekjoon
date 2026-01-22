class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int before = numLog[0];
        
        for(int i = 1; i < numLog.length; i++) {
            switch(numLog[i] - before) {
                case 1:
                    answer += "w";
                    before = numLog[i];
                break;
                case -1:
                    answer += "s";
                    before = numLog[i];
                break;
                case 10:
                    answer += "d";
                    before = numLog[i];
                break;
                case -10:
                    answer += "a";
                    before = numLog[i];
                break;
            }
        }
        return answer;
    }
}