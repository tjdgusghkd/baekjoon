class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int[] alphabet = new int[26];
        
        for(int i = 0; i < before.length(); i++){
            alphabet[before.charAt(i)-'a']++;
            alphabet[after.charAt(i)-'a']--;
        }
        
        for(int i : alphabet){
            if(i != 0) {
               answer = 0;
                break;
            }
        }
        return answer;
    }
}