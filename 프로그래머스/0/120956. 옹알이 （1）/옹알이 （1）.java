class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] tCase = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < tCase.length; j++) {
                if(babbling[i].contains(tCase[j])) {
                   babbling[i] = babbling[i].replace(tCase[j], " ");
                }
            }
        }
        
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].trim().equals("")) {
                answer++;
            }
        }
        return answer;
    }
}