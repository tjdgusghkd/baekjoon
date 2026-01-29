import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        List<Integer> list = new ArrayList<Integer>();
        

        for(int i = 0; i < arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        
        int len = Math.min(k, list.size());
        
        for(int i = 0; i < len; i++){
            answer[i] = list.get(i);
        }
        
        for (int i = len; i < k; i++) {
            answer[i] = -1;
        }
        return answer;
    }
}