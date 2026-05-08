import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days = new int[progresses.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            days[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
        }

        int standardDay = days[0];
        int count = 1;

        for (int i = 1; i < days.length; i++) {
            if (days[i] <= standardDay) {
                count++;
            } else {
                list.add(count);
                standardDay = days[i];
                count = 1;
            }
        }

        list.add(count);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}