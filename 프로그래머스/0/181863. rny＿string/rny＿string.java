class Solution {
    public String solution(String rny_string) {
        String answer = "";
        String m = "rn";
        
        String[] arr = rny_string.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("m")) {
                arr[i] = m;
            }
        }
        for(String w : arr){
            answer += w;
        }
        return answer;
    }
}