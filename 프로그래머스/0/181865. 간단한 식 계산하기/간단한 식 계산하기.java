class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bino = binomial.split(" ");
        int a = Integer.parseInt(bino[0]);
        int b = Integer.parseInt(bino[2]);
        switch(bino[1]){
            case "+":
                answer = a + b;
            break;
            case "-":
                answer = a - b;
            break;
            case "*":
                answer = a * b;
            break;   
        }
        return answer;
    }
}