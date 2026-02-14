class Solution {
    public int solution(int order) {
        int answer = 0;
        String w = order+"";
        for(int i = 0; i < w.length(); i++){
            char c = w.charAt(i);
            if((c == '3') || (c == '6') || (c == '9')){
                answer++;
            }
        }
        return answer;
    }
}