class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()) {
            if(c == alp.charAt(0)) {
                sb.append((c+"").toUpperCase());
            } else {
                sb.append(c);
            }
        }
        answer = sb.toString();
        return answer;
    }
}