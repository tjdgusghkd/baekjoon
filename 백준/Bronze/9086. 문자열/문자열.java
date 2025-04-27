import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[num];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
       
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].charAt(0) + "" + arr[i].charAt(arr[i].length()-1));
        }
    }
}