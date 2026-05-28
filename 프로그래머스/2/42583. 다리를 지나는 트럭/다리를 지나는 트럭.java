import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<Integer>();
        Queue<Integer> waiting = new LinkedList<Integer>();
        int currentWeight = 0;
        for(int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }
        
        for(int i = 0; i < truck_weights.length; i++) {
            waiting.offer(truck_weights[i]);
        }
        
        while(!waiting.isEmpty()) {
            currentWeight -= bridge.poll();
            answer++;
            if(waiting.peek() + currentWeight <= weight) {
                int current = waiting.poll();
                bridge.offer(current);
                currentWeight += current;
            } else {
                bridge.offer(0);
            }
            
        }
        
        answer += bridge_length;
        
        return answer;
    }
}