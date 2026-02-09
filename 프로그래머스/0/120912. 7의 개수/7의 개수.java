class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            String w = array[i]+"";
            char[] arr= w.toCharArray();
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}