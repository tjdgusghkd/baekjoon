class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                sb.append('A'); 
            } else if (c >= 'B' && c <= 'Z') {
                sb.append(Character.toLowerCase(c)); 
            } else {
                sb.append(c); 
            }
        }
        answer = sb.toString();
        return answer;
    }
}