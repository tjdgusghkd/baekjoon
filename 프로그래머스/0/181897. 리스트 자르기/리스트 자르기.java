import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<Integer>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1){
            for(int i = 0; i < b+1; i++){
                list.add(num_list[i]);
            }
        } else if(n == 2) {
            for(int i = a; i < num_list.length;i++){
                list.add(num_list[i]);
            }
        } else if(n==3) {
            for(int i = a; i < b+1; i++){
                list.add(num_list[i]);
            }
        } else {
            for(int i = a; i < b+1; i+=c){
                list.add(num_list[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}