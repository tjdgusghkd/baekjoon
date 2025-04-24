import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
         for(int i = 0; i < n; i++) {
            sum += ((double) arr[i] / max) * 100;
        }

        double result = sum / n;

        System.out.println(result);
    }
}

