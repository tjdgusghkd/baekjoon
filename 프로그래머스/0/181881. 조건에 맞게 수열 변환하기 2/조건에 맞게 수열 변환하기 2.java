import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] current = arr;
        while(true){
            int[] next = transform(current); 
            answer++;
            if(Arrays.equals(current, next)) break; 
            current = next; 
        }
        answer -= 1;
        return answer;
    }

    public int[] transform(int[] arr){
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                res[i] = arr[i] / 2;
            } else if(arr[i] < 50 && arr[i] % 2 != 0){
                res[i] = arr[i] * 2 + 1;
            } else {
                res[i] = arr[i];
            }
        }
        return res;
    }
}
