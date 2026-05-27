import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < priorities.length; i++){
            queue.offer(new int[]{priorities[i], i});
        }
        
        while(!queue.isEmpty()){
            boolean hashHigher = false;
            
            int[] current = queue.poll();
            int priority = current[0];
            int index = current[1];
            
            for(int[] q : queue){
                if(q[0] > priority) {
                    hashHigher = true;
                    break;
                }
            }
            
            if(hashHigher) {
                queue.offer(current);
            } else {
                answer++;
                
                if(index == location) {
                    return answer;
                }
            }
            
        }
        return answer;
    }
    
}