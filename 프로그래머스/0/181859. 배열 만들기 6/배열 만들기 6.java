import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        for(int i = 0; i < arr.length;){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            } else if(!list.isEmpty() && list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
                i++;
            } else if(!list.isEmpty() && list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
                i++;
            }
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}