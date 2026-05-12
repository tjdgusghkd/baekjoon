class Solution {
    
    int answer = 0;
    boolean[] visitors;
    public int solution(int n, int[][] computers) {
        visitors = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(!visitors[i]) {
                dfs(i, computers);
                answer++;
            }
        }
        return answer;
    }
    
    void dfs(int computer, int[][] computers) {
        visitors[computer] = true;
        
        for(int i = 0; i < computers.length; i++){
            if(computers[computer][i] == 1 && !visitors[i]) {
                dfs(i, computers);
            }
        }
    }
}