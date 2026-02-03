import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i : arr){
            list.add(i);
        }
        
        for(int i = 0; i < delete_list.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j) == delete_list[i]){
                    list.remove(j);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}