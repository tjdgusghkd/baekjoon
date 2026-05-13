import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = bfs(maps);;
        
        return answer;
    }
    
    int bfs(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            
            int x = current[0];
            int y = current[1];
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < maps.length 
                   && ny < maps[0].length && maps[nx][ny] == 1){
                       maps[nx][ny] = maps[x][y] + 1;
                       queue.offer(new int[]{nx, ny});
                       
                   } 
                }
                    
            }
        if(maps[maps.length -1][maps[0].length -1] != 1){
            return maps[maps.length - 1][maps[0].length -1];
        } else {
            return -1;
        }
    }
}


