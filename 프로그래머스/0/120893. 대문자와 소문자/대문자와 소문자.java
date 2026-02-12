class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(char ch : my_string.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else {
                sb.append(Character.toUpperCase(ch));
            }
        }
        answer = sb.toString();
        return answer;
    }
}