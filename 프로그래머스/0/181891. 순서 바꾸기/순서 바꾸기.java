class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length;
        int[] answer = new int[size];

        for(int i = n; i <size; i++){
            answer[i-n] = num_list[i];
        }
        
        for(int i = 0; i < n; i++){
            answer[size-n+i] = num_list[i];
        }
        return answer;
    }
}