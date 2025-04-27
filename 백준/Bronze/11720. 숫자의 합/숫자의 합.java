import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        String result = sc.nextLine();
        String[] arr = new String[num];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = result.split("")[i];
        }

        for(int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        System.out.println(sum);
    }
}