import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<Character>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(list.contains(my_string.charAt(i))){
                continue;
            } else {
                list.add(my_string.charAt(i));
            }
        }
        
        for(char ch : list){
            sb.append(ch);
        }
        
        answer = sb.toString();
        return answer;
    }
}