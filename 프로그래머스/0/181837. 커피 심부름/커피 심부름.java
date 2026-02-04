class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String[] espresso = 
                    {"iceamericano", "americanoice", "hotamericano", 
                             "americanohot", "americano", "anything"};
        String[] latte = 
        {"icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", 
            "cafelatte"};
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < espresso.length; j++){
                if(order[i].equals(espresso[j])){
                    answer += 4500;
                }
            }
            
            for(int j = 0; j < latte.length; j++){
                if(order[i].equals(latte[j])){
                    answer += 5000;
                }
            }
        }
        return answer;
    }
}