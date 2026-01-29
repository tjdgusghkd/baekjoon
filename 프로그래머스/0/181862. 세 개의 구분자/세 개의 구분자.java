import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ").
            replaceAll("\\s+", " ");
        List<String> list = 
                        new ArrayList<>(Arrays.asList(myStr.split(" ")));
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals("")){
                list.remove(i);
            }
        }
        
        if(list.size() == 0){
            list.add("EMPTY");
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}