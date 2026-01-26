import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<Integer>();
        int size = num_list.length;
        int[] answer = new int[size - n + 1];
        
        if(size - n == 0){
            answer[0] = num_list[size-1];
        } else {
            for(int i = n-1; i < size; i++) {
                list.add(num_list[i]);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}