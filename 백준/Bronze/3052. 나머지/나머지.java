import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr  = new int[10];
        Set<Integer> result = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] % 42;

            result.add(arr[i]);
        }


        System.out.println(result.size());

    }
}