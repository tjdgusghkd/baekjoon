import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> list = new ArrayList<String>();
        
        for(int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i, my_string.length()));
        }
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(is_suffix)) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}