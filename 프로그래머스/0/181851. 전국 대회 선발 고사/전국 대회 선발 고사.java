import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        Iterator<Integer> it = map.keySet().iterator();

        int a = map.get(it.next()); 
        int b = map.get(it.next()); 
        int c = map.get(it.next()); 
        answer = a * 10000 + b * 100 + c;
        return answer;
    }
}