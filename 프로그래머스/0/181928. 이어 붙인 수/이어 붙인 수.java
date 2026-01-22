class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String ex1 = "";
        String ex2 = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 != 0) {
                ex1 += num_list[i] + "";
            } else{
                ex2 += num_list[i] + "";   
            }
        }
        
        answer = Integer.parseInt(ex1) + Integer.parseInt(ex2);
        
        return answer;
    }
}

