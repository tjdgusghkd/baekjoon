class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i+=m) {
            if(i+m+1 > my_string.length()) {
                answer += my_string.substring(i).charAt(c-1);   
            } else {
                answer += my_string.substring(i, i+m+1).charAt(c-1);
            }
        }
        return answer;
    }
}