class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int test1 = 1;
        int test2 = 0;
        for(int i = 0; i < num_list.length; i++) {
            test1 *= num_list[i];
            test2 += num_list[i];
        }
        if(test1 < (test2*test2)) {
            answer = 1;
        } else {
            answer = 0 ;
        }
        return answer;
    }
}