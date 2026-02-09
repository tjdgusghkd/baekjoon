import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String word = my_string.toLowerCase();
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        answer = "";
        for(char c : arr){
            answer += c;
        }
        
        return answer;
    }
}