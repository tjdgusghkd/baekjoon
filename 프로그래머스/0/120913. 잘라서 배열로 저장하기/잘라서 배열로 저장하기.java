import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < my_str.length(); i+=n){
            if(i + n > my_str.length()){
                list.add(my_str.substring(i, my_str.length()));
            } else {
                list.add(my_str.substring(i, i+n));
            }
        }
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}