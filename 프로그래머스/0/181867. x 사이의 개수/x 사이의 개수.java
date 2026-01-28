class Solution {
    public int[] solution(String myString) {
        String[] splitWord = myString.split("x", -1);
        int[] answer = new int[splitWord.length];
        for(int i = 0; i < splitWord.length; i++){
            answer[i] = splitWord[i].length();
        }
        
        return answer;
    }
}