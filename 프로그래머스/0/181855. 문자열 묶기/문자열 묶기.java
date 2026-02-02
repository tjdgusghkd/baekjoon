import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i =0; i < strArr.length; i++){
            int len = strArr[i].length();
            map.put(len, map.getOrDefault(len, 0) + 1);

        }
        for(int a : map.values()){
            if(answer < a){
                answer = a;
            }
        }
        
        return answer;
    }
}