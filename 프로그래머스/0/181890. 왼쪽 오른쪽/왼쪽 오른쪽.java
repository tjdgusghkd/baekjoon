import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<String>();
        String ch = "";
        int idx = -1;
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){
                ch = str_list[i];
                idx = i;
                break;
            }
        }
        if(ch.equals("l")){
            for(int i = 0; i < idx; i++){
                list.add(str_list[i]);
            }
        } else if(ch.equals("r")) {
            for(int i = idx+1; i < str_list.length; i++){
                list.add(str_list[i]);
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}