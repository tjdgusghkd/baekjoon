class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int aLength = answer.length;
        int last = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if(answer[aLength - 2] > answer[aLength - 3]) {
            answer[aLength - 1] = answer[aLength -2] - answer[aLength-3];
        } else {
            answer[aLength - 1] = answer[aLength - 2] * 2;
        }
        
        return answer;
    }
}