import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(map.containsKey(a)){
                sb.append(map.get(a) + " ");
            } else {
                sb.append(0 + " ");
            }
        }
       
        System.out.println(sb);
    }
}