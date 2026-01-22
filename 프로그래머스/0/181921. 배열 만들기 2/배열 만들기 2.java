import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = l; i <= r; i++) {
            int m = 0;
            String num = String.valueOf(i);
               if(num.contains("5")) {
                  num = num.replace("5", "");
               }
                if(num.contains("0")) {
                    num = num.replace("0", "");
                }
            
            if(num.equals("")) {
                list.add(i);
            }
            m++;
        }
        int[] answer;
        if(list.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[list.size()];    
        }
        
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }       
        return answer;
    }
}