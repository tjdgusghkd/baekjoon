import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        int[] arr = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for(int i = 0; i < num; i++ ){ 
            if(arr[i] == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}