class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] word = myString.toCharArray();
        for(int i = 0; i < word.length; i++){
            if(word[i] == 'A') {
                word[i] = 'B';
            } else if(word[i] == 'B') {
                word[i] = 'A';
            }
        }
        String nWord = "";
        for(int i = 0; i < word.length; i++){
            nWord += word[i];
        }
        
        if(nWord.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}