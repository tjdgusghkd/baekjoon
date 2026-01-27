import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<String>();
        String[] answer = new String[(names.length + 4) / 5];
        for(int i = 0; i <=names.length-1; i += 5){
            list.add(names[i]);
        }
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}