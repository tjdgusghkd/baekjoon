import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = 0; i < a; i++) {
            int c = sc.nextInt();
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < b; i++) {
            int c = sc.nextInt();
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int i : map.values()) {
            if(i == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}