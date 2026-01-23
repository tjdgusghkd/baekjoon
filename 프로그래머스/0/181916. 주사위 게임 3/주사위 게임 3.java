import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a, 0) + 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        int answer = 0;

        if (map.size() == 1) {
            // 모두 같은 경우 (4개)
            int p = map.keySet().iterator().next();
            answer = 1111 * p;

        } else if (map.size() == 2) {
            // (3,1) 또는 (2,2)
            int p = 0, q = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 3) p = entry.getKey();
                else if (entry.getValue() == 1) q = entry.getKey();
                else if (entry.getValue() == 2) {
                    if (p == 0) p = entry.getKey();
                    else q = entry.getKey();
                }
            }

            if (p != 0 && q != 0 && map.containsValue(3)) {
                answer = (10 * p + q) * (10 * p + q);
            } else {
                answer = (p + q) * Math.abs(p - q);
            }

        } else if (map.size() == 3) {
            // (2,1,1)
            int p = 0, q = 1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 2) p = entry.getKey();
                else q *= entry.getKey();
            }
            answer = q;

        } else {
            // 모두 다른 경우
            answer = Collections.min(map.keySet());
        }

        return answer;
    }
}
