import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i : nums){
            set.add(i);
        }
        if(max < set.size()){
            answer = max;
        } else {
            answer = set.size();
        }
        return answer;
    }
}