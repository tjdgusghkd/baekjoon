import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int num = sc.nextInt();
        String result = "";
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i<arr1.length; i++) {
            if(arr1[i] < num) {
                result += arr1[i] + " ";
            }
        }
     
        System.out.println(result);
    }
}