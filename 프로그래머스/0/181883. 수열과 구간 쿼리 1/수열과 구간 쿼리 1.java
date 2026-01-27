class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < queries.length; i++){
            for(int j = 0; j < arr.length; j++){
                int s = queries[i][0];
                int e = queries[i][1];
                if(j >= s && j <= e) {
                    arr[j]++;
                }
            }
        }
        answer = arr;
        return answer;
    }
}