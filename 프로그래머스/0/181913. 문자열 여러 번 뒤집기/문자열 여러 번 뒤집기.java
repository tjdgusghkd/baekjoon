class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        for(int i = 0; i <queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
             while (a < b) {
                char tmp = sb.charAt(a);
                sb.setCharAt(a, sb.charAt(b));
                sb.setCharAt(b, tmp);
                a++;
                b--;
            }
            
            answer = sb.toString();
        }
        return answer;
    }
}