import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int minIdx = -1;
        int maxIdx = -1;
        int size = arr.length;
        List<Integer> list = new ArrayList<>();

        
        for(int i = 0; i < size; i++) {
            if(arr[i] == 2) {
                minIdx = i;
                break;
            }
        }

        
        for(int i = size - 1; i >= 0; i--) {
            if(arr[i] == 2) {
                maxIdx = i;
                break;
            }
        }

        // 2 사이 값 추가
        if(minIdx != -1 && maxIdx != -1) {
            for(int i = minIdx; i <= maxIdx; i++){
                list.add(arr[i]);
            }
        }
        
        if(minIdx == -1 && maxIdx == -1) {
            list.add(-1);
        }

        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
